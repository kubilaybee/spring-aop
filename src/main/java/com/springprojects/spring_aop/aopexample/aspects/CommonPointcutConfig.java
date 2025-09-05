package com.springprojects.spring_aop.aopexample.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {
    @Pointcut("execution(* com.springprojects.spring_aop.aopexample.*.*.*(..))")
    public void businessAndDataPackageConfig(){
    }
    @Pointcut("execution(* com.springprojects.spring_aop.aopexample.business.*.*(..))")
    public void businessDataPackageConfig(){
    }
    @Pointcut("execution(* com.springprojects.spring_aop.aopexample.data.*.*(..))")
    public void dataPackageConfig(){
    }
    @Pointcut("bean(*Service*)")
    public void allPackageConfigUsingBean(){}

    @Pointcut("@annotation(com.springprojects.spring_aop.aopexample.annotations.TrackTime)")
    public void trackTimeAnnotation(){}
}
