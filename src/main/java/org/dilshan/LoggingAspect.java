package org.dilshan;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

    @Before("execution(* org.dilshan.ShoppingCart.checkout(..))")
    public void logger(JoinPoint joinPoint) {
        log.info("Jointpoint Signature: {}", joinPoint.getSignature());
        log.info("Jointpoint Param Value: {}", joinPoint.getArgs()[0].toString());
        log.info("Before Loggers");
    }

    @After("execution(* *.*.*.checkout(..))")
    public void afterLogger() {
        log.info("After Logger");
    }

    @Pointcut("execution(* org.dilshan.ShoppingCart.quantity())")
    public void afterReturningPointCut() {
    }

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "returnValue")
    public void afterReturning(int returnValue) {
        log.info("After Returning returnValue: {}", returnValue);
    }

}
