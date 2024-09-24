package org.shvk.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/orderProcessingServiceFallback")
    public String orderProcessingServiceFallback() {
        return "Order Service is Down!";
    }

    @GetMapping("/paymentServiceFallback")
    public String paymentServiceFallback() {
        return "Payment Service is Down!";
    }

    @GetMapping("/productCatalogServiceFallback")
    public String productCatalogServiceFallback() {
        return "Product Catalog Service is Down!";
    }
}
