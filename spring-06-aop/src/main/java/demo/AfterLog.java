package demo;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class AfterLog implements AfterReturningAdvice {
    // 方法返回值的切面。
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println(method.getName() + "返回值是" + o);
    }
}
