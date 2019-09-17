package com.blog.entity;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
    private int art_id; //博文id
    private Date art_date;  //发布时间
    private String art_title;   //博文标题
    private String art_content; //博文内容
    private int art_views;  //浏览数
    private int art_comment;    //评论数
    private int art_like;   //点赞数
    private User user;      //发布人
    private Sorts sorts;    //所属分类

    public Article() {
    }

    public Article(Date art_date, String art_title, String art_content, int art_views, int art_comment, int art_like, User user, Sorts sorts) {
        this.art_date = art_date;
        this.art_title = art_title;
        this.art_content = art_content;
        this.art_views = art_views;
        this.art_comment = art_comment;
        this.art_like = art_like;
        this.user = user;
        this.sorts = sorts;
    }

    public int getArt_id() {
        return art_id;
    }

    public void setArt_id(int art_id) {
        this.art_id = art_id;
    }

    public Date getArt_date() {
        return art_date;
    }

    public void setArt_date(Date art_date) {
        this.art_date = art_date;
    }

    public String getArt_title() {
        return art_title;
    }

    public void setArt_title(String art_title) {
        this.art_title = art_title;
    }

    public String getArt_content() {
        return art_content;
    }

    public void setArt_content(String art_content) {
        this.art_content = art_content;
    }

    public int getArt_views() {
        return art_views;
    }

    public void setArt_views(int art_views) {
        this.art_views = art_views;
    }

    public int getArt_comment() {
        return art_comment;
    }

    public void setArt_comment(int art_comment) {
        this.art_comment = art_comment;
    }

    public int getArt_like() {
        return art_like;
    }

    public void setArt_like(int art_like) {
        this.art_like = art_like;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Sorts getSorts() {
        return sorts;
    }

    public void setSorts(Sorts sorts) {
        this.sorts = sorts;
    }
}
