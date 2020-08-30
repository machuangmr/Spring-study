package demo2;

import demo2.impl.UserDaoImpl;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class Proxy implements UserDao{
    private UserDaoImpl userdaoImpl;
    public Proxy() {

    }
    public Proxy(UserDaoImpl userdaoImpl) {
        this.userdaoImpl = userdaoImpl;
    }

    public void delete() {
        System.out.println("【DEBUG】日志记录删除了一个对象");
        userdaoImpl.delete();
    }
}
