package com.ma.pojo;


/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class Proxy implements rent{
    // 这里我们使用组合
    private Host target;

    public Proxy(Host host) {
        this.target = host;
    }

    public  Proxy() {

    }

    public void rentHouse() {
        System.out.println("中介帮房东租房子");
    }
}
