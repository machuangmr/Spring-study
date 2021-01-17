package com.ma.edu.service.impl;

import com.ma.edu.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
@Service
public class UserServiceImpl implements UserService {
    public String query() {
        return "hello, Service....";
    }
}
