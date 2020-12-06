package com.yhf.eshop.user.dao.impl;

import com.yhf.eshop.common.dao.BaseDAO;
import com.yhf.eshop.common.dao.impl.BaseDAOimpl;
import com.yhf.eshop.user.dao.UserDAO;
import com.yhf.eshop.user.entity.UserEntity;

import java.util.List;

public class UserDAOimpl extends BaseDAOimpl implements UserDAO {

    /**
     * 调用IDataAccess 获取数据并返回
     * 1、创建IDatatAccess 子类 TXTDataAccess的对象
     *      IDataAccess dataACCess = new TXTDataAccess();
     * 2、调用该对象的方法获取所有数据并返回
     *      List<User> userList = dataAccess.getList(User.clss);
     * @return
     * @throws Exception
     */

    @Override
    public List<UserEntity> getEntityList() throws Exception {
//        2、调用该对象的方法获取所有数据并返回
        return  dataAccess.getList(UserEntity.class);
    }
}
