package com.xckk.cloudalibabagateway9009.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

@Component
public class MyGateWayFilter implements Ordered, GlobalFilter {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String username = exchange.getRequest().getQueryParams().getFirst("username");
        System.out.println("myfilter >>>>>>>>" + username + " : " + new Date());
        if (username == null || "xxx".equals(username)) {
            System.out.println("非法用户， 用户为null" + username);
            return exchange.getResponse().setComplete();
        }

        return chain.filter(exchange);
    }

    /**
     * 加载过滤器的顺序
     * @return 整数数字越小优先级越高
     */
    @Override
    public int getOrder() {
        return 0;
    }
}
