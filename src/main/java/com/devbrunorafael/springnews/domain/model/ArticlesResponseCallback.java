package com.devbrunorafael.springnews.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ArticlesResponseCallback {

    private String status;
    private String totalResults;
    private List<News> articles;

}
