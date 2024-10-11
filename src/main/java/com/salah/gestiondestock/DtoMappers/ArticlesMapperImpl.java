package com.salah.gestiondestock.DtoMappers;

import com.salah.gestiondestock.Dtos.ArticlesDto;
import com.salah.gestiondestock.model.Articles;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ArticlesMapperImpl {

    public ArticlesDto fromArticles(Articles articles){
        ArticlesDto articlesDto = new ArticlesDto();
        BeanUtils.copyProperties(articles,articlesDto);
        return articlesDto;
    }

    public Articles fromArticlesDTO(ArticlesDto articlesDto){

        Articles articles = new Articles();
        BeanUtils.copyProperties(articlesDto,articles);
        return articles;
    }

}
