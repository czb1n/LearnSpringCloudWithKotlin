package com.czb1n.learning.springcloud.feign.impl

import com.czb1n.learning.springcloud.feign.HelloService
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RestController

/**
 * Created by czb1n.
 */
@RestController
class HelloServiceImpl : HelloService {

    @Value("\${server.port}")
    var port: String? = null

    override fun hello(name: String): String {
        return "response from $port: hello $name."
    }

}