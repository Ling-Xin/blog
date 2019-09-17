package com.blog.service;

import com.blog.dao.UserDao;

public interface UserService {
    UserDao login(UserDao user);  //用户登录
    boolean reg(UserDao user);     //用户注册
}
