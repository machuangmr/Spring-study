package demo2;

import demo2.impl.UserDaoImpl;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class MyTest {
    public static void main(String[] args) {
        UserDaoImpl userDao = new UserDaoImpl();
        Proxy proxy = new Proxy(userDao);
        // 增加一个代理类，在代理类中调用被代理类的方法。不用去修改原来代码。
        // 在之前被代理的方法前后进行增强处理。
        // 这个
        proxy.delete();
    }
}
