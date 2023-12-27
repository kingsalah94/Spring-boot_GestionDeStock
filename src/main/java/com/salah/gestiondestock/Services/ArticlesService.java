package com.salah.gestiondestock.Services;

import com.salah.gestiondestock.Dtos.ArticlesDto;
import com.salah.gestiondestock.Exceptions.ArticlesNotFoundException;

import java.util.List;

public interface ArticlesService {
    ArticlesDto addArticles(ArticlesDto articlesDto);

    ArticlesDto updateArticles(ArticlesDto articlesDto);

    void deleteArticles(Integer id);

    ArticlesDto getOneArticles(Integer id) throws ArticlesNotFoundException;

    List<ArticlesService> getAllArticles();

}
