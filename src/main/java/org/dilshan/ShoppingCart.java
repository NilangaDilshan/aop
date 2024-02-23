package org.dilshan;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ShoppingCart {
    @CustLog
    public void checkout(String status) {
        log.info("Checkout Method from ShoppingCart Called...");
    }

    public int quantity() {
        return 2;
    }
}
