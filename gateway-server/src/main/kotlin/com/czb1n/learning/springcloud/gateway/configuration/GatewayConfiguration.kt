package com.czb1n.learning.springcloud.gateway.configuration

import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Created by czb1n.
 */
@Configuration
class GatewayConfiguration {

    @Bean
    fun routes(builder: RouteLocatorBuilder): RouteLocator {
        return builder.routes()
            .route {
                it.predicate { p -> p.request.queryParams["name"]?.get(0) == "czb1n" }
                    .filters { f -> f.addRequestHeader("Name", "czb1n") }
                    .uri("http://httpbin.org:80")
            }
            .route {
                it.path("/get")
                    .uri("http://httpbin.org:80")
            }
            .build()
    }

}