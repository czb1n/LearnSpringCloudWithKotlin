package com.czb1n.learning.springcloud.consul.ribbon.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

/**
 * Created by czb1n.
 */
@RestController
class DemoController {

    @Autowired
    lateinit var restTemplate: RestTemplate

    @RequestMapping("/hello")
    fun hello(@RequestParam("name") name: String): String? {
        return restTemplate.getForObject("http://CONSUL-CLIENT/hello?name=$name", String::class.java)
    }

}