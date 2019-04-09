package com.czb1n.learning.springcloud.feign

import org.springframework.stereotype.Component

/**
 * Created by czb1n.
 */
@Component
class HelloServiceFallback : HelloService {

    override fun hello(name: String): String {
        return "fallback function: hello $name."
    }

}