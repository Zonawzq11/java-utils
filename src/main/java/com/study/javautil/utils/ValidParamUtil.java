package com.study.javautil.utils;

import com.study.javautil.ownerannotition.ValidParam;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect

public class ValidParamUtil {
    @Pointcut("@annotation(com.study.javautil.ownerannotition.ValidParam)")
    public void pointCut(){
    }
    @Around("pointCut()")
    public Object checkParam(ProceedingJoinPoint point) throws Throwable{
        //获取被注解的方法
        Object proceed = point.proceed();
        return  proceed;
    }
}
