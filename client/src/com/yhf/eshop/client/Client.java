package com.yhf.eshop.client;

/*
* 客户端的顶层基类
* 处理公共的用户操作
* */
public class Client {

//    全局 用户操作 登录
    public static final String LOGIN = "L";
//     全局 用户操作 返回上一次操作纪录
    public static final String HISTORY = "H";
//    首页
    public static final String INDEX = "I";

    public static void main(String[] args) {
        UserClient userClient = new UserClient();
        String result = userClient.showLogin();
        if(result.equals(LOGIN)){
            System.out.println("这里是登录页面");
        }else if (result.equals(HISTORY)){
            System.out.println("这里是历史页面");
        }else {
            System.out.println("出错了");
        }
    }
}
