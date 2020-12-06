package com.yhf.eshop.common.dao.impl;

import com.yhf.eshop.common.dao.BaseDAO;
import com.yhf.eshop.common.dao.IDataAccess;

public class BaseDAOimpl implements BaseDAO {
//    创建IDataAccess 子类 TXTDataAccess的对象
    protected IDataAccess dataAccess = new TXTDataAccess();


}
