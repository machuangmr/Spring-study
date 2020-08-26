package com.ma.mytest;

import com.ma.pojo.Person;
import com.ma.pojo.Student;
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
public class MyTest {

    @Test
    public void testName() {
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       User user = (User)context.getBean("user");
        System.out.println(user.toString());
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }

    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student2 = context.getBean("student2", Student.class);
        System.out.println(student2);
    }

    @Test
    public void testAutowire() {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("person", Person.class);
        person.getCat().shout();
    }

}
