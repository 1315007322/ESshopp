package com.yhf.eshop.user.dao;

import com.yhf.eshop.common.dao.BaseDAO;
import com.yhf.eshop.user.entity.UserEntity;

import java.util.List;

public interface UserDAO extends BaseDAO {
    List<UserEntity> getEntityList() throws Exception;
}
