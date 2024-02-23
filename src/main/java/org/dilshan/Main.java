package org.dilshan;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {
    public static void main(String[] args) {
        log.info("Test Main...");

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        ShoppingCart shoppingCart = context.getBean(ShoppingCart.class);

        shoppingCart.checkout("CANCELLED");
        int quantity = shoppingCart.quantity();
    }
}