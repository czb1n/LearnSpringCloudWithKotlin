package com.czb1n.learning.springcloud.feign

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam


/**
 * Created by czb1n.
 */
@FeignClient("feign-provider", fallbackFactory = HelloServiceFallbackFactory::class)
interface HelloService {

    @RequestMapping("/hello")
    fun hello(@RequestParam("name") name: String): String

}