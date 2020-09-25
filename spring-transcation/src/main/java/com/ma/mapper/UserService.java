package com.ma.mapper;

import com.ma.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public interface UserService {

    public void add(User user);

    public void delete(@Param("id") int id);

    public void transcation();


}
