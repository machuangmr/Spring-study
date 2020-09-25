package demo3;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 方式三：使用注解实现aop
 */
@Aspect
public class AnnotationAspect {
    @Before("execution(* demo.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("方式三：在业务方法之前执行");
    }

    @After("execution(* demo.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("在业务方法之后执行");
    }
}
