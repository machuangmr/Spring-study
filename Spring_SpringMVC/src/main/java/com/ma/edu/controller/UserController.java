package com.ma.edu.controller;

import com.ma.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
@RestController
// @RestController = @Controller + @ResponseBody， 将返回的值作为一个字符串输出，
// 如果不用@ResponseBody,会将返回结果作为一个映射的路径输出，所以会报错404
public class UserController {

    @Autowired
    private UserService userService;

   @GetMapping("/user/query")
    public String query() {
       System.out.println("132131231");
        return userService.query();
    }

}
