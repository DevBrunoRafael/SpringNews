package com.devbrunorafael.springnews.api.controller;

import com.devbrunorafael.springnews.domain.service.NewsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/News")
@AllArgsConstructor
public class NewsController {

    private NewsService newsService;

}
