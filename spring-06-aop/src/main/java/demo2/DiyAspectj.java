package demo2;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class DiyAspectj{

    public void before() {
        System.out.println("在方法之前执行=====");
    }

    public void after() {
        System.out.println("在方法之后====执行");
    }
}
