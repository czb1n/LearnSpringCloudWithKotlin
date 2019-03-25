package com.czb1n.learning.springcloud.eureka.client.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * Created by czb1n.
 */
@RestController
class DemoController {

    @Value("\${server.port}")
    var port: String? = null

    @RequestMapping("/hello")
    fun hello(@RequestParam("name") name: String): String {
        return "response from $port: hello $name."
    }

}