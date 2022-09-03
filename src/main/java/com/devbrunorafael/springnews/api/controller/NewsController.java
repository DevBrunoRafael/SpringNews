package com.devbrunorafael.springnews.api.controller;

import com.devbrunorafael.springnews.domain.model.News;
import com.devbrunorafael.springnews.domain.service.NewsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
@AllArgsConstructor
@Api(value = "News API")
public class NewsController {

    private NewsService newsService;

    @GetMapping("/assunto/{topic}")
    @ApiOperation("Search for news on a specific topic")
    @ResponseStatus(HttpStatus.OK)
    public List<News> findNewsBySpecificTopic(@PathVariable String topic){
        return newsService.findNewsBySpecificTopic(topic);
    }

    @GetMapping("/pais/{country}")
    @ApiOperation(value = "Search for the main news of the informed country")
    @ResponseStatus(HttpStatus.OK)
    public List<News> findNewsByCountry(@PathVariable String country){
        return newsService.findNewsByCountry(country);
    }

    @GetMapping("/categoria/{category}")
    @ApiOperation(value = "Searches for news of a certain category at an international level")
    @ResponseStatus(HttpStatus.OK)
    public List<News> findNewsByCategory(@PathVariable String category){
        return newsService.findNewsByCategory(category);
    }

    @GetMapping("/fonte/{sources}")
    @ApiOperation(value = "Search for general news in the informed source")
    @ResponseStatus(HttpStatus.OK)
    public List<News> findNewsBySources(@PathVariable String sources){
        return newsService.findNewsBySources(sources);
    }
}
