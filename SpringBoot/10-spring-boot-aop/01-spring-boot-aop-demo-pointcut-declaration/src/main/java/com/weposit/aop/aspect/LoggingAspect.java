package com.weposit.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    //this is where we add all of our related advice for logging
    //@Before("execution(public void addAccount())")
    //@Before("execution(public void add*())")

    @Pointcut("execution(* com.weposit.aop.dao.*.*(..))")
    public void forDaoPackage() {}

    @Before("forDaoPackage()")
    public void beforeAddAccount(){
        System.out.println("\n====>>> Executing @Before  advice on addAccount()");
    }
}
