package com.yhf.eshop.common.action;
/*
* 用户控制器类
* 处理用户的后台操作，返回消息（jSON格式的字符串）
* */
public class UserAction extends BaseAction{
//    登录用户名
    private String username;
//    登录密码
    private String password;

    public String getUsername() {
        return username;
    }

    /**
     * 用户登录
     * @param username 登录名
     * @param password 密码
     * @return
     * */
    public String login(String username,String password){
        return "";
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
