package com.spring.aop.learn.aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class UserAspect {

    @Before("execution (* com.spring.aop.learn.service.UserService.*(..))")
    public void before(JoinPoint joinPoint){
        System.out.println("User Aspect Before Method Called...");
        System.out.print(joinPoint.getSignature().getName() + " called with arguments ");
        System.out.println(Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(pointcut = "execution (* com.spring.aop.learn.service.UserService.*(..))", returning = "results")
    public void afterReturning(JoinPoint joinPoint, Object results){
        System.out.println("User Aspect After Returning Method Called...");
        System.out.print(joinPoint.getSignature().getName() + " called with arguments ");
        System.out.println(Arrays.toString(joinPoint.getArgs()));
        System.out.println("Returns " + results);
    }
}
