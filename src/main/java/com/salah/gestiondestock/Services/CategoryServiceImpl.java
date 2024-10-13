package com.salah.gestiondestock.Services;

import com.salah.gestiondestock.DtoMappers.CategoryMapperImpl;
import com.salah.gestiondestock.Dtos.CategoryDto;
import com.salah.gestiondestock.Enums.ErrorCodes;
import com.salah.gestiondestock.Exceptions.EntityNotFoundException;
import com.salah.gestiondestock.Exceptions.InvalideEntityException;
import com.salah.gestiondestock.Repositories.CategoryRepository;
import com.salah.gestiondestock.Validators.CategoryValidator;
import com.salah.gestiondestock.model.Category;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.View;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@AllArgsConstructor
public class CategoryServiceImpl implements CategorieService{

    private final View error;
    private CategoryRepository categoryRepository;
    private CategoryMapperImpl dtoMapper;


    @org.springframework.beans.factory.annotation.Autowired
    public CategoryServiceImpl(View error) {
        this.error = error;
    }

    @Override
    public CategoryDto addCategory(CategoryDto categoryDto) {
        List<String> errors = CategoryValidator.validate(categoryDto);
        if(!errors.isEmpty()) {
            //Logger l'erreur
            log.error("Error while adding Category: {}", errors);
            //Lever l'exception
            throw new InvalideEntityException("La Categorie n'est pas valide", ErrorCodes.CATEGORY_NOT_VALIDE,errors);
        }
        Category category = dtoMapper.fromCategoryDto(categoryDto);
        Category categorySaved = categoryRepository.save(category);
        return dtoMapper.fromCategory(categorySaved);
    }

    @Override
    public CategoryDto updateCategory(CategoryDto categoryDto) {
        List<String> errors = CategoryValidator.validate(categoryDto);
        if(!errors.isEmpty()) {
            log.error("Error while updating Category: {}", errors);
            throw new InvalideEntityException("La Categorie n'est pas valide", ErrorCodes.CATEGORY_NOT_VALIDE, errors);
        }
        Category category = dtoMapper.fromCategoryDto(categoryDto);
        Category categoryUpdated = categoryRepository.save(category);
        return dtoMapper.fromCategory(categoryUpdated);
    }

    @Override
    public void deleteCategory(Integer id) {
        if (id == null){
            log.error("Error while deleting Category {}",error);
            return;
        }
        categoryRepository.deleteById(id);

    }

    @Override
    public CategoryDto getOneCategory(Integer id) throws EntityNotFoundException {
       if(id == null) {
           log.error("Error while getting Category {}",error);
           return null;
       }
       Category category = categoryRepository.findById(id)
               .orElseThrow(()->new EntityNotFoundException("Category not found", ErrorCodes.CATEGORY_NOT_FOUND));
        return dtoMapper.fromCategory(category);
    }

    @Override
    public CategoryDto getArticleByCodeCategory(String code) throws EntityNotFoundException {
        if(!StringUtils.hasLength(code)){
            log.error("Category code is nul {}",error);
            return  null;
        }
        Category category = categoryRepository.findCategoryByCodeCategory(code)
                .orElseThrow(()->new EntityNotFoundException("Category not found",ErrorCodes.CATEGORY_NOT_FOUND));
        return dtoMapper.fromCategory(category);
    }

    @Override
    public List<CategoryDto> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();
        return categories.stream()
                .map(category -> dtoMapper.fromCategory(category))
                .collect(Collectors.toList());
    }
}
