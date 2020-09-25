package com.ma.mapper;

import com.ma.model.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class UserServiceImpl extends SqlSessionDaoSupport implements UserService{


    public void add(User user) {
        getSqlSession().getMapper(UserService.class).add(user);
    }

    public void delete(int id) {
        getSqlSession().getMapper(UserService.class).delete(id);
    }
    public void transcation() {

        // 如果没有加上事物，则插入成功，删除失败，
        // 因为事物的特性，所以我们需要保证，删除失败的同时也要保证插入失败。
        User user = new User(5, "小王", "123123");
        add(user);
        delete(1);
    }



}
