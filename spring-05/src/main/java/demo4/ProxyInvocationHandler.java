package demo4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class ProxyInvocationHandler implements InvocationHandler {
    // 真正需要被代理的对象
    private Object target;


    // 通过set方法将需要代理的对象注入
    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    // 处理对象的实例
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 真正需要执行的方法
        log(method.getName());
       return method.invoke(target, args);
    }
    // 在应用处理类中可以添加一些打印日志功能
    public void log(String msg){
        System.out.println("执行了"+ msg + "方法！！！");
    }
}
