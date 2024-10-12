package com.salah.gestiondestock.Web;

import com.salah.gestiondestock.Dtos.CategoryDto;
import com.salah.gestiondestock.Exceptions.EntityNotFoundException;
import com.salah.gestiondestock.Services.CategorieService;
import com.salah.gestiondestock.Web.Api.CategorieApi;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
public class CategoryController implements CategorieApi {

    private CategorieService categorieService;

    @Override
    public CategoryDto addCategory(CategoryDto categoryDto) {
        return categorieService.addCategory(categoryDto);
    }

    @Override
    public CategoryDto updateCategory(CategoryDto categoryDto) {
        return categorieService.updateCategory(categoryDto);
    }

    @Override
    public void deleteCategory(Integer id) {
        categorieService.deleteCategory(id);
    }

    @Override
    public CategoryDto getOneCategory(Integer id) throws EntityNotFoundException {
        return categorieService.getOneCategory(id);
    }

    @Override
    public CategoryDto getArticleByCodeCategory(String code) throws EntityNotFoundException {
        return categorieService.getArticleByCodeCategory(code);
    }

    @Override
    public List<CategoryDto> getAllCategories() {
        return categorieService.getAllCategories();
    }
}
