package com.blog.entity;

import java.io.Serializable;

public class Sorts implements Serializable {
    private int sorts_id;   //分类id
    private String sorts_name;  //分类名称
    private String desc;    //分类描述

    public Sorts() {
    }

    public Sorts(String sorts_name, String desc) {
        this.sorts_name = sorts_name;
        this.desc = desc;
    }

    public int getSorts_id() {
        return sorts_id;
    }

    public void setSorts_id(int sorts_id) {
        this.sorts_id = sorts_id;
    }

    public String getSorts_name() {
        return sorts_name;
    }

    public void setSorts_name(String sorts_name) {
        this.sorts_name = sorts_name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
