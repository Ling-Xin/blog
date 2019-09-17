package com.blog.service;

import com.blog.entity.Comments;

import java.util.List;

public interface CommentsService {
    boolean publishCmt(Comments comments);  //发布评论
    boolean delCmt(int cmt_id); //删除评论
    List<Comments> showAllConnmentsByArt(int art_id);   //显示博文下所有评论
}
