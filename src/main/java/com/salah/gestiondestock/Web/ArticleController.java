package com.salah.gestiondestock.Web;

import com.salah.gestiondestock.Dtos.ArticlesDto;
import com.salah.gestiondestock.Exceptions.EntityNotFoundException;
import com.salah.gestiondestock.Services.ArticlesService;
import com.salah.gestiondestock.Web.Api.ArticlesApi;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
public class ArticleController implements ArticlesApi {

    private ArticlesService articlesService;

    @Override
    public ArticlesDto addArticles(ArticlesDto articlesDto) {
        return articlesService.addArticles(articlesDto);
    }

    @Override
    public ArticlesDto updateArticles(ArticlesDto articlesDto) {
        return articlesService.updateArticles(articlesDto);
    }

    @Override
    public void deleteArticles(Integer id) {
        articlesService.deleteArticles(id);
    }

    @Override
    public ArticlesDto getOneArticles(Integer id) throws EntityNotFoundException {
        return articlesService.getOneArticles(id);
    }

    @Override
    public ArticlesDto getArticleByCodeArticle(String codeArticle) throws EntityNotFoundException {
        return articlesService.getArticleByCodeArticle(codeArticle);
    }

    @Override
    public List<ArticlesDto> getAllArticles() {
        return articlesService.getAllArticles();
    }
}
