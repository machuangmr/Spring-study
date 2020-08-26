package com.ma.test;

import com.ma.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class TestUser {

    @Test
    public void test1() {
        // spring 默认是初始化无参数构造
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User)applicationContext.getBean("user");
        User user2 = (User)applicationContext.getBean("user");
        System.out.println(user == user2);
    }
}
