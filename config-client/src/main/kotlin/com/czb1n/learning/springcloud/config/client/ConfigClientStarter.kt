package com.czb1n.learning.springcloud.config.client

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

/**
 * Created by czb1n.
 */
@SpringBootApplication
@EnableDiscoveryClient
class ConfigClientStarter

fun main(args: Array<String>) {
    runApplication<ConfigClientStarter>(*args)
}