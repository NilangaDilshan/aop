package org.dilshan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.dilshan")
@EnableAspectJAutoProxy
public class BeanConfig {

}
