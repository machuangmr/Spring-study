package com.ma.staticproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class TestDyProxy {
    public static void main(String[] args) {
        // 目标对象类
        final SomeService target = new SomeServieImpl();
        target.doSomeServie("哈哈哈哈");
        // 使用jdk提供的动态代理生成代理类
        SomeService proxy = (SomeService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // 这里可以做前置或者后置的处理
                System.out.println("jdk动态代理生成的代理对象");
                String invoke = (String) method.invoke(target, args[0]);
                System.out.println(invoke);
                System.out.println("jdk 动态代理后置的处理");
                return invoke;
            }
        });
        System.out.println(proxy.doSomeServie("hello"));
    }
}
