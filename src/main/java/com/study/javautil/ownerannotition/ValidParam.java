package com.study.javautil.ownerannotition;

import java.lang.annotation.Documented;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.*;

/**
 * 标注在参数bean上，表示需要对该参数校验
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ValidParam {
    /**
     * 请求当前接口的参数，多个以 ，号分隔
     * @return
     */
    String fieldNames() default "";
    /**
     * 参数类
     * @return
     */
    Class<?> parameter() default Object.class;
    /**
     * 是否检验参数，默认不校验参数
     * @return
     */
    boolean require() default false;

}
