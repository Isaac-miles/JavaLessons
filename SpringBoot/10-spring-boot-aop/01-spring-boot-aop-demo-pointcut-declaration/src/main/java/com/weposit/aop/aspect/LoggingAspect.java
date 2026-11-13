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

    //create a pointcut for getter methods
    @Pointcut("execution(* com.weposit.aop.dao.*.get*(..))")
    public void getterMethod() {}

    //create a pointcut for setter methods
    @Pointcut("execution(* com.weposit.aop.dao.*.set*(..))")
    public void setterMethod() {}

    //create a pointcut: include package ... exclude getter/setter
    @Pointcut("forDaoPackage() && !(getterMethod() || setterMethod())")
    private void forDaoPackageMethodNoGetterSetter() {}

    @Before("forDaoPackageMethodNoGetterSetter()")
    public void beforeAddAccount(){
        System.out.println("\n====>>> Executing @Before  advice on addAccount()");
    }

    @Before("forDaoPackageMethodNoGetterSetter()")
    public void performAnalytics(){
        System.out.println("\n====>>> Performing API Analytics");
    }
}
