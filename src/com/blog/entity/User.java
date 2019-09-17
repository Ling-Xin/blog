package com.blog.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private int user_id;    //用户ID
    private String user_nickName;   //用户昵称
    private String user_pwd;   //用户密码
    private String user_email;  //用户email
    private String user_photo;  //用户头像
    private String user_level;  //用户等级·
    private Date user_reg_time; //用户注册时间
    private Date user_birthday; //用户生日
    private int user_age;   //用户年龄
    private String user_tel;    //用户电话
    private int flag;   //用户标识 0 普通用户 1管理员

    public User() {
    }

    public User(String user_nickName, String user_pwd, String user_email, String user_photo, String user_level, Date user_reg_time, Date user_birthday, int user_age, String user_tel, int flag) {
        this.user_nickName = user_nickName;
        this.user_pwd = user_pwd;
        this.user_email = user_email;
        this.user_photo = user_photo;
        this.user_level = user_level;
        this.user_reg_time = user_reg_time;
        this.user_birthday = user_birthday;
        this.user_age = user_age;
        this.user_tel = user_tel;
        this.flag = flag;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_nickName() {
        return user_nickName;
    }

    public void setUser_nickName(String user_nickName) {
        this.user_nickName = user_nickName;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_photo() {
        return user_photo;
    }

    public void setUser_photo(String user_photo) {
        this.user_photo = user_photo;
    }

    public String getUser_level() {
        return user_level;
    }

    public void setUser_level(String user_level) {
        this.user_level = user_level;
    }

    public Date getUser_reg_time() {
        return user_reg_time;
    }

    public void setUser_reg_time(Date user_reg_time) {
        this.user_reg_time = user_reg_time;
    }

    public Date getUser_birthday() {
        return user_birthday;
    }

    public void setUser_birthday(Date user_birthday) {
        this.user_birthday = user_birthday;
    }

    public int getUser_age() {
        return user_age;
    }

    public void setUser_age(int user_age) {
        this.user_age = user_age;
    }

    public String getUser_tel() {
        return user_tel;
    }

    public void setUser_tel(String user_tel) {
        this.user_tel = user_tel;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
