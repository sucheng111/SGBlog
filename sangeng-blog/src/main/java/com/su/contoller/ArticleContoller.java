package com.su.contoller;


import com.su.dataobject.Article;
import com.su.service.ArticleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleContoller {

    @Resource(name = "articleServiceImpl")
    private ArticleService articleService;


    @GetMapping("/list")
    public List<Article> list(){
        return articleService.list();
    }


}
