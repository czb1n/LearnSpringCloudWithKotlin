package com.czb1n.learning.springcloud.zuul.filters

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider
import org.springframework.http.client.ClientHttpResponse
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Component
import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStream


/**
 * Created by czb1n.
 */
@Component
class DemoFallbackProvider : FallbackProvider {

    override fun getRoute(): String {
        return "*"
    }

    override fun fallbackResponse(route: String?, cause: Throwable?): ClientHttpResponse {
        return object : ClientHttpResponse {
            @Throws(IOException::class)
            override fun getStatusCode(): HttpStatus {
                return HttpStatus.OK
            }

            @Throws(IOException::class)
            override fun getRawStatusCode(): Int {
                return HttpStatus.OK.value()
            }

            @Throws(IOException::class)
            override fun getStatusText(): String {
                return HttpStatus.OK.reasonPhrase
            }

            override fun close() {}

            @Throws(IOException::class)
            override fun getBody(): InputStream {
                return ByteArrayInputStream("fallback response.".toByteArray())
            }

            override fun getHeaders(): HttpHeaders {
                return HttpHeaders()
            }
        }
    }

}