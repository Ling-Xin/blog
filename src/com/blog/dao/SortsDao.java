package com.blog.dao;

import com.blog.entity.Sorts;

import java.util.List;

public interface SortsDao {
    boolean addSorts(Sorts sorts);  //新增分类
    boolean delSorts(int sorts_id); //删除分类
    boolean editSorts(int sorts_id,Sorts sorts);    //修改分类
    List<Sorts> showAllSorts(); //显示所有分类
}
