package com.yhf.eshop.common.entity;

/**
 * 消息封装类
 *
 */
public class Msg {

//    返回状态的 常量
    private static final String SUCCESS = "成功";
    private static final String FAIL = "失败";

//    消息的返回状态码
    private String code;

//    返回的消息内容
    private String data;

//    消息返回状态： 成功或者失败
    private String status;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
