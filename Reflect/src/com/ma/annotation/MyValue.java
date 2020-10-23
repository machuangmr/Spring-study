package com.ma.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD,ElementType.TYPE})
public @interface MyValue {

    String value();
}
