package com.ma.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */

/**
 *  这个类也被Spring 容器托管，注册到容器中，其实本质上他也是一个@Component
 * @Configuration 代表这个类就是一个配置类，就相当于我们之前的applicationContext.xml
 */
@Configuration
//@Import() 可以导入其他的配置类，类似Spring配置文件中的import标签。
public class AppConfig {

    /**
     *  这个就相当于注册一个bean，就相当于我们之前写的bean的标签。
     *  这个方法的名字就是我们之前xml中方法的名称
     *  方法的返回值就是我们bean标签中的class属性。
     * @return
     */
    @Bean
    public User getUser() {
        return new User(); // 就是我们要注入的对象。
    }
}
