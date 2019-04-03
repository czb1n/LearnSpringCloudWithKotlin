package com.czb1n.learning.springcloud.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * Created by czb1n.
 */
@SpringBootApplication
class GatewayServerStarter

fun main(args: Array<String>) {
    runApplication<GatewayServerStarter>(*args)
}