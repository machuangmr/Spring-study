package com.ma.mapper;

import com.ma.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;
import java.util.Queue;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class UserMapperImpl implements UserMapper {

    private SqlSessionTemplate sqlSession;

    /**
     * 利用构造器将sqlSession注入
     * @return
     */
//    public UserMapperImpl(SqlSessionTemplate sqlSession) {
//        this.sqlSession = sqlSession;
//    }
//    public UserMapperImpl() {
//
//    };


    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectUsers() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUsers();
    }
}
