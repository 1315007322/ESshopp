package com.yhf.eshop.user.action;


import com.yhf.eshop.common.action.BaseAction;
import com.yhf.eshop.common.entity.Msg;
import com.yhf.eshop.common.until.JSONUntil;
import com.yhf.eshop.log.dao.ISysLog;
import com.yhf.eshop.log.dao.impl.consoleLog;
import com.yhf.eshop.user.entity.UserEntity;
import com.yhf.eshop.user.service.UserService;
import com.yhf.eshop.user.service.impl.UserServiceImpl;

/*
* 用户控制器类
* 处理用户的后台操作，返回消息（jSON格式的字符串）
* */
public class UserAction extends BaseAction {
//    登录用户名
    private String username;
//    登录密码
    private String password;


    public String getUsername() {
        return username;
    }

    /**
     * 用户登录功能
     * 1、封装用户数据到User对象
     * 2、调用 UserService处理逻辑器
     *      UserEntity login(UserEntity user) throws Exception;
     * 3、处理异常
     * 4、根据服务返回结果生成消息
     * 消息实体Msg
     * 5、记录日志(待开发)
     * 6、响应消息到客户端
     * @return
     * */
    public String login(){
        Msg msg = new Msg();
        try {
//        1、封装用户数据到User对象
        UserEntity user = new UserEntity();
        user.setUsername(username);
        user.setPassword(password);
//        2、调用 UserService处理逻辑器
        UserService userService = new UserServiceImpl();
        user = userService.login(user);
//        3、处理异常
        if(user != null){
            msg.setCode("200");
            msg.setData("登录成功");
            msg.setStatus(Msg.SUCCESS);

            log.info(username + "已登录");
        }else {
            msg.setCode("200");
            msg.setData("用户名或者密码不正确");
            msg.setStatus(Msg.FAIL);
        }
            return JSONUntil.entity2JSON(msg);
        }catch (Exception e){
            e.printStackTrace();
            msg.setCode("200");
            msg.setData("服务器异常");
            msg.setStatus(Msg.FAIL);
            return JSONUntil.entity2JSON(msg);
        }
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
