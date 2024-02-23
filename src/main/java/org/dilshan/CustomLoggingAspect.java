package org.dilshan;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class CustomLoggingAspect {
    @Pointcut("@annotation(CustLog)")
    public void customLogPointCut() {
    }

    @Before("customLogPointCut()")
    public void logMethodCalls() {
        log.error("In the custom log aspect...");
    }
}
