package com.czb1n.learning.springcloud.hystrix

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker
import org.springframework.cloud.netflix.hystrix.EnableHystrix
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard

/**
 * Created by czb1n.
 */
@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
class HystrixClientStarter

fun main(args: Array<String>) {
    runApplication<HystrixClientStarter>(*args)
}