package com.salah.gestiondestock.Services;

import com.salah.gestiondestock.Dtos.CategoryDto;
import com.salah.gestiondestock.Exceptions.EntityNotFoundException;

import java.util.List;

public interface CategorieService {
    CategoryDto addCategory(CategoryDto categoryDto);

    CategoryDto updateCategory(CategoryDto categoryDto);

    void deleteCategory(Integer id);

    CategoryDto getOneCategory(Integer id) throws EntityNotFoundException;
    CategoryDto getArticleByCodeCategory(String code) throws EntityNotFoundException;

    List<CategoryDto> getAllCategories();
}
