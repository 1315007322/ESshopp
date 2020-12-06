package com.yhf.eshop.common.dao.impl;

import com.yhf.eshop.common.dao.IDataAccess;
import com.yhf.eshop.common.until.FileUtil;
import com.yhf.eshop.common.until.JSONUntil;

import java.util.List;

public class TXTDataAccess implements IDataAccess {

    /**
     * 获取数据列表
     *
     * 1、根据实体类的字节码文件对象获取类名
     * 2、根据类名获取用户数据文件名
     * 3、合成数据文件路径
     * 4、使用文件操作工具类读取文件中的字符串数据
     * 5、将字符串数据转换成List<UserEntity>对象返回
     * @param clazz
     * @param <T>
     * @return
     * @throws Exception
     */
    public <T> List<T> getList(Class<T> clazz) throws Exception{
//        1、根据实体类的字节码文件对象获取类名
        String userName = clazz.getSimpleName().toLowerCase(); //User => user
//        2、根据类名获取用户数据文件名
        String dataFileName = "db_" + userName + ".txt";
//        3、合成数据文件路径
        String dataFilePath = "db/" + dataFileName;
//        4、使用文件操作工具类读取文件中的字符串数据
        String DataJson = FileUtil.readByBuffered(dataFilePath);
//        5、将字符串数据转换成List<UserEntity>对象返回
        return JSONUntil.json2EntityList(DataJson,clazz);





    }

}
