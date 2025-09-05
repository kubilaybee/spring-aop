package com.springprojects.spring_aop.aopexample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {

    private Logger logger = LoggerFactory.getLogger(getClass());

    // pointcut
    @Before("com.springprojects.spring_aop.aopexample.aspects.CommonPointcutConfig.allPackageConfigUsingBean()")
    public void logMethodCallBeforeExecution(JoinPoint joinpoint) {
        //logic
        logger.info("Before Aspect - {} is called with arguments {}",
                joinpoint,
                joinpoint.getArgs());
    }

    @After("com.springprojects.spring_aop.aopexample.aspects.CommonPointcutConfig.dataPackageConfig()")
    public void logMethodCallAfterExecution(JoinPoint joinpoint) {
        //logic
        logger.info("After Aspect - {} has executed",
                joinpoint);
    }

    @AfterReturning(
            pointcut = "com.springprojects.spring_aop.aopexample.aspects.CommonPointcutConfig.businessAndDataPackageConfig()",
            returning = "resultValue"
    )
    public void logMethodCallAfterSuccessfulExecution(JoinPoint joinpoint, Object resultValue) {
        //logic
        logger.info("AfterReturning Aspect - {} has returned {}",
                joinpoint, resultValue);
    }

    @AfterThrowing(
            pointcut = "com.springprojects.spring_aop.aopexample.aspects.CommonPointcutConfig.businessDataPackageConfig()",
            throwing = "exception"
    )
    public void logMethodCallAfterException(JoinPoint joinpoint, Exception exception) {
        //logic
        logger.info("AfterThrowing Aspect - {} has thrown an exception {}",
                joinpoint, exception);
    }
}
