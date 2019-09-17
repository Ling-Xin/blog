package com.blog.entity;

import java.io.Serializable;
import java.util.Date;

public class Comments implements Serializable {
    private int cmt_id; //评论id
    private User user;  //评论人
    private Article article;    //评论博文
    private String cmt_content; //评论内容
    private Date cmt_date;  //评论时间

    public Comments() {
    }

    public Comments(User user, Article article, String cmt_content, Date cmt_date) {
        this.user = user;
        this.article = article;
        this.cmt_content = cmt_content;
        this.cmt_date = cmt_date;
    }

    public int getCmt_id() {
        return cmt_id;
    }

    public void setCmt_id(int cmt_id) {
        this.cmt_id = cmt_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public String getCmt_content() {
        return cmt_content;
    }

    public void setCmt_content(String cmt_content) {
        this.cmt_content = cmt_content;
    }

    public Date getCmt_date() {
        return cmt_date;
    }

    public void setCmt_date(Date cmt_date) {
        this.cmt_date = cmt_date;
    }
}
