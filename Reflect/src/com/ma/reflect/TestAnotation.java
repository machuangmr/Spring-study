package com.ma.reflect;

import com.ma.annotation.MyValue;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class TestAnotation {
    public static void main(String[] args) throws Exception {
        Class<?> clz = Class.forName("com.ma.model.Person");
        Field[] fields = clz.getDeclaredFields();
        Object obj = clz.newInstance();
        for (Field field : fields) {
            MyValue annotation = field.getAnnotation(MyValue.class);
            if (annotation != null) {
                String value = annotation.value();
                Method method = clz.getMethod("setName", String.class);
                method.setAccessible(true);
                method.invoke(obj, value);
            }
        }
        System.out.println(obj.toString());
    }
}
