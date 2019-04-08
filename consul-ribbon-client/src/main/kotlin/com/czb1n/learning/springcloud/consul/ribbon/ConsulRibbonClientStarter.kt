package com.czb1n.learning.springcloud.consul.ribbon

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

/**
 * Created by czb1n.
 */
@SpringBootApplication
@EnableDiscoveryClient
class ConsulRibbonClientStarter

fun main(args: Array<String>) {
    runApplication<ConsulRibbonClientStarter>(*args)
}