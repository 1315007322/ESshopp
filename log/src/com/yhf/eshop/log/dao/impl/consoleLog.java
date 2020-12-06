package com.yhf.eshop.log.dao.impl;

import com.yhf.eshop.log.dao.ISysLog;
import com.yhf.eshop.log.entity.Log;

import java.text.SimpleDateFormat;
import java.util.Date;

public class consoleLog implements ISysLog {
    SimpleDateFormat time = new SimpleDateFormat("h:mm a");

    @Override
    public void info(String msg) {
        //封装日志
       String log =  new Log(msg,INFO,time.format(new Date())).toString();
        System.out.println(log);
    }

    @Override
    public void warn(String msg) {
        String log =  new Log(msg,WARN,time.format(new Date())).toString();
        System.out.println(log);
    }

    @Override
    public void error(String msg) {
        String log =  new Log(msg,ERROR,time.format(new Date())).toString();
        System.out.println(log);
    }
}
