package com.devbrunorafael.springnews.domain.service;

import com.devbrunorafael.springnews.domain.model.ArticlesResponseCallback;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestTemplateService {

    public ArticlesResponseCallback makeRequestNewsApi (String reqLink){
        return new RestTemplate().getForEntity(reqLink, ArticlesResponseCallback.class)
                .getBody();
    }
}
