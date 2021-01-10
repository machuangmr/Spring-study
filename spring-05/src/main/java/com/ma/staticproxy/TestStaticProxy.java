package com.ma.staticproxy;

import java.sql.SQLOutput;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class TestStaticProxy {
    public static void main(String[] args) {
        SomeService target = new SomeServieImpl();
        StaticProxy proxy= new StaticProxy(target);
        String s = proxy.doSomeServie("hello, world!!!");
        System.out.println(s);
    }
}
