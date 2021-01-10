package com.ma.cglibproxy;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class UserServiceImpl{

    public String say(String msg) {
        System.out.println("hello " + msg);
        return "world";
    }
}
