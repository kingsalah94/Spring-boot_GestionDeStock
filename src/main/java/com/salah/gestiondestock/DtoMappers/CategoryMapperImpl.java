package com.salah.gestiondestock.DtoMappers;

import com.salah.gestiondestock.Dtos.CategoryDto;
import com.salah.gestiondestock.model.Category;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class CategoryMapperImpl {

    public CategoryDto fromCategory(Category category){
        CategoryDto categoryDto = new CategoryDto();
        BeanUtils.copyProperties(category,categoryDto);
        return categoryDto;
    }

    public Category fromCategoryDto(CategoryDto categoryDto){
        Category category = new Category();
        BeanUtils.copyProperties(categoryDto,category);
        return category;
    }
}
