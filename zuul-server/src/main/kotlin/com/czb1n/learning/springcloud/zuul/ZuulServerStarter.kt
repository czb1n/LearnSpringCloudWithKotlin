package com.czb1n.learning.springcloud.zuul

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

/**
 * Created by czb1n.
 */
@SpringBootApplication
@EnableZuulProxy
class ZuulServerStarter

fun main(args: Array<String>) {
    runApplication<ZuulServerStarter>(*args)
}