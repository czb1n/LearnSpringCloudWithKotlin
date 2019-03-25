package com.czb1n.learning.springcloud.ribbon

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

/**
 * Created by czb1n.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
class RibbonClientStarter

fun main(args: Array<String>) {
    runApplication<RibbonClientStarter>(*args)
}