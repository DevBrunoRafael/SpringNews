package com.devbrunorafael.springnews.api.controller;

import com.devbrunorafael.springnews.domain.model.News;
import com.devbrunorafael.springnews.domain.service.NewsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
@AllArgsConstructor
public class NewsController {

    private NewsService newsService;

    @GetMapping("/pais/{country}")
    @ResponseStatus(HttpStatus.OK)
    public List<News> findNewsByCountry(@PathVariable String country){
        return newsService.findNewsByCountry(country);
    }

    @GetMapping("/categoria/{category}")
    @ResponseStatus(HttpStatus.OK)
    public List<News> findNewsByCategory(@PathVariable String category){
        return newsService.findNewsByCategory(category);
    }

    @GetMapping("/fonte/{sources}")
    @ResponseStatus(HttpStatus.OK)
    public List<News> findNewsBySources(@PathVariable String sources){
        return newsService.findNewsBySources(sources);
    }
}
