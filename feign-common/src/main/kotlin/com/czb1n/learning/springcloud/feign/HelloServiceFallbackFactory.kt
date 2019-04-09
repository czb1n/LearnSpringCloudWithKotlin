package com.czb1n.learning.springcloud.feign

import feign.hystrix.FallbackFactory
import org.springframework.stereotype.Component

/**
 * Created by czb1n.
 */
@Component
class HelloServiceFallbackFactory(val helloServiceFallback: HelloServiceFallback) : FallbackFactory<HelloService> {

    override fun create(throwable: Throwable?): HelloService {
        println("hello service fallback reason : ${throwable?.message ?: "unknown error."}")
        return helloServiceFallback
    }

}