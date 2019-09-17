package com.blog.dao.impl;

import com.blog.dao.CommentsDao;
import com.blog.entity.Comments;

import java.util.List;

public class CommentsDaoImpl implements CommentsDao {
    @Override
    public boolean publishCmt(Comments comments) {
        return false;
    }

    @Override
    public boolean delCmt(int cmt_id) {
        return false;
    }

    @Override
    public List<Comments> showAllConnmentsByArt(int art_id) {
        return null;
    }
}
