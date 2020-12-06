package com.yhf.eshop.client;

import com.yhf.eshop.common.entity.Msg;
import com.yhf.eshop.common.until.JSONUntil;
import com.yhf.eshop.user.action.UserAction;

import java.util.Scanner;

/*
* 用户操作界面
* 所有和 用户操作相关的 内容 都放在这里
* */
public class UserClient extends Client{

    /**
     * 用户登录操作
     * 1、使用控制台提示输入 用户名 和密码
     * 2、像服务器发送请求，并接收返回的 字符串消息数据
     * 用setter方法将数据发送给action
     * 调用Action登录功能
     * 3、解析消息字符串，提示用户信息
     * 4、页面跳转，使用字符串作为标记跳转页面
     * 成功返回上次操作的页面
     * 失败返回登录页面
     * @return
     */
    public String showLogin(){
//        1、使用控制台提示输入 用户名 和密码
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = scanner.nextLine();
        System.out.println("请输入密码：");
        String password = scanner.nextLine();
//        2、像服务器发送请求，并接收返回的 字符串消息数据
        UserAction userAction = new UserAction();
//        2.0用setter方法将数据发送给action
        userAction.setUsername(username);
        userAction.setPassword(password);
        //          2.1调用Action登录功能
        String result = userAction.login();
        Msg msg = JSONUntil.json2Entity(result,Msg.class);
        if (msg.getStatus().equals(Msg.SUCCESS)){ //登录成功
            System.out.println(msg.getData());
            return HISTORY;
        }else {
            System.out.println(msg.getData()); //登录失败
            return LOGIN;
        }
    }

}
