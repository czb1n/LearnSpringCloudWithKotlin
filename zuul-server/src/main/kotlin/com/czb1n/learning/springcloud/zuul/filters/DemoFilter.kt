package com.czb1n.learning.springcloud.zuul.filters

import com.netflix.zuul.ZuulFilter
import com.netflix.zuul.context.RequestContext
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Component

/**
 * Created by czb1n.
 */
@Component
class DemoFilter : ZuulFilter() {
    override fun run(): Any? {
        val ctx = RequestContext.getCurrentContext()
        val request = ctx.request
        val response = ctx.response
        if (request.getParameter("name") != "czb1n") {
            ctx.responseStatusCode = HttpStatus.UNAUTHORIZED.value()
            ctx.setSendZuulResponse(false)
            response.writer.write("Sorry, I don't know you.")
        }
        return null
    }

    override fun shouldFilter(): Boolean {
        return true
    }

    override fun filterType(): String {
        return PRE_TYPE
    }

    override fun filterOrder(): Int {
        return 0
    }

}