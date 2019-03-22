package com.czb1n.learning.springcloud.hystrix.controller

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.lang.Exception

/**
 * Created by czb1n.
 */
@RestController
class DemoController {

    @RequestMapping("hello")
    @HystrixCommand(fallbackMethod = "fallback")
    fun hello(@RequestParam("name") name: String): String {
        throw Exception("test exception")               // throw test exception here
        return "hello $name."
    }


    fun fallback(name: String): String {
        return "fallback function: hello $name."
    }
}