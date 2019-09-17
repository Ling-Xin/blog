package com.blog.service;

import com.blog.dao.ArticleDao;

import java.util.List;

public interface ArticleService {
    boolean publishArticle(ArticleDao article);    //发布博文
    boolean editArticle(int art_id, ArticleDao article);    //编辑博文
    List<ArticleDao> showAllArticleBySorts(int sorts_id); //显示分类下所有博文
    boolean delArticle(int art_id); //删除博文
}
