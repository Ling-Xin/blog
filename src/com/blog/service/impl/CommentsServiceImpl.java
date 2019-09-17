package com.blog.service.impl;

import com.blog.entity.Comments;
import com.blog.service.CommentsService;

import java.util.List;

public class CommentsServiceImpl implements CommentsService {
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
