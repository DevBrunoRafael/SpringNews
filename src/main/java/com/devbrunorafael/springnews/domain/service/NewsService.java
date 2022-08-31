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

    public News findLatestNews(String username){
        return new RestTemplate()
                .getForEntity(newsApi, News.class).getBody();
    }

    // aplicar filtro de pais com (country=br&)

    public List<News> findNewsByCountry(String country){
        String model = "https://newsapi.org/v2/top-headlines?country=us&apiKey=";
        return null;
    }

    public List<News> findNewsByCategory(String category){
        String model = "https://newsapi.org/v2/top-headlines?category=business&apiKey=";
        return null;
    }

    public List<News> findNewsBySources(String sources){
        String model = "https://newsapi.org/v2/top-headlines?sources=bbc-news&apiKey=";
        return null;
    }
}
