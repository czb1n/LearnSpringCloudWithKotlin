package com.czb1n.learning.springcloud.eureka.client

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

/**
 * Created by czb1n.
 */
@SpringBootApplication
@EnableEurekaClient
class EurekaClientStarter

fun main(args: Array<String>) {
    runApplication<EurekaClientStarter>(*args)
}