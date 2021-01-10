package com.ma.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class CglibProxy implements MethodInterceptor {
    private UserServiceImpl target;

    public CglibProxy(UserServiceImpl target) {
        this.target = target;
    }

    /**
     * 提供一个方法创建动态代理类
     * @return 返回动态代理类
     */
    public UserServiceImpl createProxy() {
        Enhancer enhancer = new Enhancer();
        // 指定父类
        enhancer.setSuperclass(target.getClass());
        // 指定回掉方法
        enhancer.setCallback(this);
        return (UserServiceImpl)enhancer.create();
    }

    /**
     * 需要执行的具体代理方法
     * @param o 要代理的对象
     * @param method 反射对应Method信息
     * @param objects 参数列表
     * @param methodProxy 代理方法
     * @return 代理返回值
     * @throws Throwable 异常信息
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib前置处理。。。。");
        String res = (String)method.invoke(target, objects[0]);
        System.out.println("cglib后置处理。。。。");
        return res.toUpperCase();
    }
}
