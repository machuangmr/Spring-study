package com.ma.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
@Component
@Scope("prototype")
public class Student {

    @Value("小马")
    private String name;

    public void play() {
        System.out.println("student always playes computer game, his name = " + name);
    }
}
