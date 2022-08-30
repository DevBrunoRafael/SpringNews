package com.devbrunorafael.springnews.domain.service;

import com.devbrunorafael.springnews.domain.model.News;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

    @Value("${news-api}")
    private String newsApi;

    public News findLatestNews(String username){
        return new RestTemplate()
                .getForEntity(newsApi, News.class).getBody();
    }

}
