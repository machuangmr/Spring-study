package com.ma.staticproxy;

import javax.swing.text.html.HTML;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class StaticProxy implements SomeService{
    // 代理对象和目标对象应该实现相同的功能接口，代理对象暴露给调用方的只是对应的功能。但是具体的实现还是由真正的目标对象去做
    // 这里对于目标对象的注入可以使用构造器注入, 也可以使用设置器注入 set方法
    private SomeService target;

/*  设置器注入
    public void setTarget(SomeService target) {
        this.target = target;
    }*/


     // 构造器注入
    public StaticProxy(SomeService target) {
        this.target = target;
    }


    public String doSomeServie(String msg) {
        System.out.println("前置增强");
        String res = target.doSomeServie(msg);
        System.out.println("后置收尾动作");
        return res.toUpperCase();
    }
}
