package org.dilshan;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class AuthenticationAspect {

    @Pointcut("within(org..*)")
    public void authenticatingPointCut() {
    }

    @Pointcut("within(org..*)")
    public void authorizationPointCut() {
    }

    @Before("authenticatingPointCut() && authorizationPointCut()")
    public void authenticate() {
        log.info("Authenticating the Request");
    }
}
