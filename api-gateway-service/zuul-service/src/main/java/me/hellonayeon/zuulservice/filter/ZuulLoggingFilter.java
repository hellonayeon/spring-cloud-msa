package me.hellonayeon.zuulservice.filter;


import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Component
public class ZuulLoggingFilter extends ZuulFilter {

    @Override
    public Object run() throws ZuulException {
        log.error("[zuul logging filter] run(): start print logs");

        System.out.println("hello");
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest req = ctx.getRequest();
        log.error("[zuul logging filter] run(): {}", req.getRequestURI());

        log.error("[zuul logging filter] run(): end print logs");
        return null;
    }

    @Override
    public String filterType() {
        return "[zuul logging filter] filterType(): pre filter";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

}
