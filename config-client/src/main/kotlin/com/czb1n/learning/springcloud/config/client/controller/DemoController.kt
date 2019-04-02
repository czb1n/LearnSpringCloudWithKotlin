package com.czb1n.learning.springcloud.config.client.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by czb1n.
 */
@RestController
class DemoController {

    @Value("\${name}")
    var name: String? = null

    @Value("\${name}")
    var version: String? = null

    @RequestMapping("/hello")
    fun hello(): String {
        return "hello $name(version $version)."
    }

}