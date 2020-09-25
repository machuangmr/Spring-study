import demo.UserService;
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
    public void testAop() {
      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = (UserService)context.getBean("userService");
        service.add();
        /** 总结：
         * 1、编写业务方法
         * 2、编写通知类，需要实现通知的方法。前置通知，后置通知
         * 3、在applicationContext.xml文件中，配置aop，需要配置：1、切入点（pointcut）2、需要配置在哪个地方切入。
         *
         */
    }
    @Test
    public void testAop2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = (UserService)context.getBean("userService");
        service.add();
    }
}
