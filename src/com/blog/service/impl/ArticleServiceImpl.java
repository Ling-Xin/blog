package com.blog.service.impl;

import com.blog.dao.ArticleDao;
import com.blog.service.ArticleService;

import java.util.List;

public class ArticleServiceImpl implements ArticleService {
    @Override
    public boolean publishArticle(ArticleDao article) {
        return false;
    }

    @Override
    public boolean editArticle(int art_id, ArticleDao article) {
        return false;
    }

    @Override
    public List<ArticleDao> showAllArticleBySorts(int sorts_id) {
        return null;
    }

    @Override
    public boolean delArticle(int art_id) {
        return false;
    }
}
