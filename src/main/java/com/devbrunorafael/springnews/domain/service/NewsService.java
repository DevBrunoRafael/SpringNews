package com.devbrunorafael.springnews.domain.service;

import com.devbrunorafael.springnews.domain.model.News;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class NewsService {

    @Value("${news-api}")
    private String newsApi;

    @Value("${news-api-key}")
    private String newsApiKey;

    private final String headlines = "top-headlines?";

    public News findLatestNews(String username){
        return new RestTemplate()
                .getForEntity(newsApi, News.class).getBody();
    }

    // aplicar filtro de pais com (country=br&)

    public List<News> findNewsByCountry(String country){
        String requisitionLink = this.newsApi
                .concat(this.headlines)
                .concat("country=")
                .concat(country)
                .concat(this.newsApiKey);

        return null;
    }

    public List<News> findNewsByCategory(String category){
        String requisitionLink = this.newsApi
                .concat(this.headlines)
                .concat("category=")
                .concat(category)
                .concat(this.newsApiKey);

        return null;
    }

    public List<News> findNewsBySources(String sources){
        String requisitionLink = this.newsApi
                .concat(this.headlines)
                .concat("sources=")
                .concat(sources)
                .concat(this.newsApiKey);

        return null;
    }
}
