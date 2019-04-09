package com.czb1n.learning.springcloud.feign

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.openfeign.EnableFeignClients

/**
 * Created by czb1n.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
class FeignProviderStarter

fun main(args: Array<String>) {
    runApplication<FeignProviderStarter>(*args)
}