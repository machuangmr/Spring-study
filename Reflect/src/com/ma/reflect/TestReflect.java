package com.ma.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class TestReflect {
    public static void main(String[] args) throws Exception {
        // 获取一个类的的字节码对象
        Class<?> clz = Class.forName("com.ma.model.Person");

        // 获取到所有的变量
        Field[] fields = clz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("--" + field);
        }

        // 获取所有方法名称
        Method[] declaredMethods = clz.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println("--" + method);
        }
        // 利用反射执行类的方法
        // 1、 获取该类的对象
        Object obj = clz.newInstance();
        // 2、 调用类的方法
        Method method = clz.getMethod("getString", String.class);
        // 3、 如果是私有方法，需要设置访问权限。
        method.setAccessible(true);
        method.invoke(obj,"Hello, world!!!");

    }
}
