package demo4;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class Client {
    public static void main(String[] args) {
        // 真正 需要被代理的对象
        UserServiceImpl userService = new UserServiceImpl();
        // 创建处理应用程序类实例
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService);
        UserService proxy = (UserService)pih.getProxy();
        proxy.add();
    }
}
