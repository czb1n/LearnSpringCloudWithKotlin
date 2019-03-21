package com.czb1n.learning.springcloud.eureka.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

/**
 * Created by czb1n.
 */
@SpringBootApplication
@EnableEurekaServer
class EurekaServerStarter

fun main(args: Array<String>) {
    runApplication<EurekaServerStarter>(*args)
}