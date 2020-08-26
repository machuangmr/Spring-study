import com.ma.config.AppConfig;
import com.ma.config.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class MyTest {

    @Test
    public void testConfig() {
       ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        User getUer = (User)applicationContext.getBean("getUser");
        System.out.println(getUer.getName());
    }
}
