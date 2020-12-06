package com.yhf.eshop.common.action;

import com.yhf.eshop.log.dao.ISysLog;
import com.yhf.eshop.log.dao.impl.consoleLog;

/*
* 控制器的基类
* 1、封装请求数据
* 2、校验权限
* 3、调用服务层（service）层处理业务逻辑
* 4、日志的记录
* 5、返回消息给客户端
* */
public class BaseAction {
    protected ISysLog log = new consoleLog();

}
