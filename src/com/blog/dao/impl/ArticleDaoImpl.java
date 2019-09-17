package com.blog.dao.impl;

import com.blog.dao.ArticleDao;

import java.util.List;

public class ArticleDaoImpl implements ArticleDao {
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
