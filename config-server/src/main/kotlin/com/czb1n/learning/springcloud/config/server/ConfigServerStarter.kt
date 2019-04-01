package com.czb1n.learning.springcloud.config.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

/**
 * Created by czb1n.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
class EurekaClientStarter

fun main(args: Array<String>) {
    runApplication<EurekaClientStarter>(*args)
}