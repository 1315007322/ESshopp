package com.yhf.eshop.user.service.impl;

import com.yhf.eshop.user.dao.UserDAO;
import com.yhf.eshop.user.dao.impl.UserDAOimpl;
import com.yhf.eshop.user.entity.UserEntity;
import com.yhf.eshop.user.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {


    /**
     * 用户登录，根据用户名，密码获取用户对象
     * 1、调用UserDAO获取用户列表数据
     *  LIst<User> getEntityList() throw Exception;
     * 2、遍历用户列表，逐个与给定用户对象的用户名和密码匹配
     * 3、匹配成功则返回该用户对象，失败则返回null
     * @param User 封装了用户名 和密码实对象
     * @return 返回user对象 或者用户名 密码 错误时  返回null
     * @throws Exception
     */


    @Override
    public UserEntity login(UserEntity User) throws Exception {
//        1、调用UserDAO获取用户列表数据
//        LIst<User> getEntityList() throw Exception;
        UserDAO userDAO = new UserDAOimpl();
        List<UserEntity> userList = userDAO.getEntityList();
//        2、遍历用户列表，逐个与给定用户对象的用户名和密码匹配
        if(userList != null){
            for (UserEntity userEntity : userList) {
                if(userEntity.getUsername().equals(User.getUsername())
                    && userEntity.getPassword().equals(User.getPassword())
                ){
                    return userEntity;
                }
            }
        }

        return null;
    }
}
