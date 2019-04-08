package com.czb1n.learning.springcloud.consul

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * Created by czb1n.
 */
@SpringBootApplication
class ConsulClientStarter

fun main(args: Array<String>) {
    runApplication<ConsulClientStarter>(*args)
}