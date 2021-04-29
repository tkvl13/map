package com.example.sample.controller;

import com.example.sample.DTO.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @GetMapping("/aa")
    public String articleForm(){
        return "article/home";
    }

    @PostMapping("/article/new")
    public String articleNew(ArticleForm form){
        System.out.println(form.toString());
        return "article/new";
    }
}
