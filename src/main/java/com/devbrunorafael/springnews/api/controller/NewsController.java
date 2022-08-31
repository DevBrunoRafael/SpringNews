package com.devbrunorafael.springnews.api.controller;

import com.devbrunorafael.springnews.domain.model.News;
import com.devbrunorafael.springnews.domain.service.NewsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Controller
@RequestMapping("/News")
@AllArgsConstructor
public class NewsController {

    private NewsService newsService;

    @GetMapping("/{country}")
    @ResponseStatus(HttpStatus.OK)
    public List<News> findNewsByCountry(@PathVariable String country){
        return newsService.findNewsByCountry(country);
    }

    @GetMapping("/{category}")
    @ResponseStatus(HttpStatus.OK)
    public List<News> findNewsByCategory(@PathVariable String category){
        return newsService.findNewsByCategory(category);
    }

    @GetMapping("/{sources}")
    @ResponseStatus(HttpStatus.OK)
    public List<News> findNewsBySources(@PathVariable String sources){
        return newsService.findNewsBySources(sources);
    }
}
