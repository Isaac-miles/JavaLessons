package com.weposit.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    //this is where we add all of our related advice for logging
    @Before("execution(public void addAccount()) ")
    public void beforeAddAccount(){
        System.out.println("\n====>>> Executing @Before  advice on addAccount()");
    }
}
