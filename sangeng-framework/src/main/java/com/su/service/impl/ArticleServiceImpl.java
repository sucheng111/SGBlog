package com.su.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.su.dataobject.Article;
import com.su.service.ArticleService;
import org.springframework.stereotype.Service;
import com.su.mapper.ArticleMapper;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}
