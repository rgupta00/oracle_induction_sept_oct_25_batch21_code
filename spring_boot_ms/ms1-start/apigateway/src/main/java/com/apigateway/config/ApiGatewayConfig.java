package com.apigateway.config;

import java.time.LocalDateTime;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfig {
	//i hv to define some routes
    @Bean
    public RouteLocator oraRouteConfig(RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes()
                .route(p -> p
                        .path("/productstore/productsms/**")
                        .filters( f -> f.rewritePath("/productstore/productsms/(?<segment>.*)","/${segment}")
                                .addResponseHeader("X-Response-Time", LocalDateTime.now().toString()))
                        .uri("lb://PRODUCTS"))
                .route(p -> p
                        .path("/productstore/couponsms/**")
                        .filters( f -> f.rewritePath("/productstore/couponsms/(?<segment>.*)","/${segment}")
                                .addResponseHeader("X-Response-Time", LocalDateTime.now().toString()))
                        .uri("lb://COUPONS"))
               .build();
    }
}
