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
        /**
         * 如果完全使用了配置类方式去做，我们就可以使用annotationConfig来获取容器，通过配置类的class属性来加载。
         */
       ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        User getUer = (User)applicationContext.getBean("getUser");
        System.out.println(getUer.getName());
    }
}
