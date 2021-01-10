package com.ma.cglibproxy;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class TestCglib {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();
        CglibProxy cglibProxy = new CglibProxy(userService);
        UserServiceImpl proxy = cglibProxy.createProxy();
        System.out.println(proxy.say("machd"));
    }
}
