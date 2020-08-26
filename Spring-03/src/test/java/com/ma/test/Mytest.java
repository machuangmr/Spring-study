package com.ma.test;

import com.ma.pojo.Student;
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
public class Mytest {
    @Test
    public void testInject() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student1 = context.getBean("student", Student.class);
        Student student2 = context.getBean("student", Student.class);
        //student.play();
        System.out.println(student1 == student2);
    }
}
