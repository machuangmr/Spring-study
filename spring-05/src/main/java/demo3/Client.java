package demo3;


/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class Client {
    public static void main(String[] args) {
        HouseRent houseRent = new HouseRent();
        /**
         *   应用处理类实现invocationHandler接口，可以分为两个功能
         *   1、获取动态代理对象
         *   2、处理代理实例/
          */
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent(houseRent);
        Rent proxy = (Rent) pih.getProxy();
        proxy.RentHouse();
    }
}
