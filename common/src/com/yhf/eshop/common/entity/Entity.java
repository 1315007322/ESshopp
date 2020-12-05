package com.yhf.eshop.common.entity;
/*
* 定义实体类
* 所有模块实体类的父类
* 职责：封装数据
* */
public class Entity {
//    数据的位移标识
    private String id;

//    创建时间
    private String createTime;

//    删除时间
    private String deleteTime;

//    删除状态：已删除为 "0" 未删除为 ”1“
    private String idDel = "1";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
    }

    public String getIdDel() {
        return idDel;
    }

    public void setIdDel(String idDel) {
        this.idDel = idDel;
    }
}
