package com.blog.dao;

public interface UserDao {
    UserDao login(UserDao user);  //用户登录
    boolean reg(UserDao user);     //用户注册
}
