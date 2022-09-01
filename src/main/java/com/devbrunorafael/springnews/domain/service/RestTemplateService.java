package com.devbrunorafael.springnews.domain.service;

import com.devbrunorafael.springnews.domain.model.ResponseBodyNewsApi;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestTemplateService {

    public ResponseBodyNewsApi makeRequestNewsApi (String link){
        return new RestTemplate().getForEntity(link, ResponseBodyNewsApi.class)
                .getBody();
    }

}
