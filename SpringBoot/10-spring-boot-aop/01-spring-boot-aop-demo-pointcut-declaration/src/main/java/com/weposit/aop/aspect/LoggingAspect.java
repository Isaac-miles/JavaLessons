package com.weposit.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.weposit.aop.dao.*.*(..))")
    public void forDaoPackage() {}

    @Before("forDaoPackage()")
    public void beforeAddAccount(){
        System.out.println("\n====>>> Executing @Before  advice on addAccount()");
    }

    @Before("forDaoPackage()")
    public void performAnalytics(){
        System.out.println("\n====>>> Performing API Analytics");
    }
}
