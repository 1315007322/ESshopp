package com.yhf.eshop.common.dao;

import java.util.List;

/*
* 访问数据库（文件）
* 返回结果给DAO层
* */
public interface IDataAccess {
    <T> List<T> getList(Class<T> clazz) throws Exception;
}
