package com.czb1n.learning.springcloud.feign.controller

import com.czb1n.learning.springcloud.feign.HelloService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * Created by czb1n.
 */
@RestController
class DemoController {

    @Autowired
    lateinit var helloService: HelloService

    @RequestMapping("/hello")
    fun hello(@RequestParam("name") name: String): String {
        return helloService.hello(name)
    }

}