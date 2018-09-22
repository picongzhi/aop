package com.pcz.aop.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingAspect {

    @DeclareParents(value = "com.pcz.aop.spring.GreetingImpl", defaultImpl = ApologyImpl.class)
    private Apology apology;

    // @Around("execution(* com.pcz.aop.spring.GreetingImpl.*(..))")
    @Around("@annotation(com.pcz.aop.spring.Tag)")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        before();
        Object result = pjp.proceed();
        after();
        return result;
    }

    private void before() {
        System.out.println("Before");
    }

    private void after() {
        System.out.println("After");
    }
}
