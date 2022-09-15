package me.hellonayeon.apigatewayservice.filter;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class GlobalFilter extends AbstractGatewayFilterFactory<GlobalFilter.Config> {

    public GlobalFilter() {
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config) {
        return ((exchange, chain) -> {

            // custom pre filter
            ServerHttpRequest req = exchange.getRequest();
            ServerHttpResponse resp = exchange.getResponse();

            log.info("Global PRE filter baseMessage: {}", config.getBaseMessage());

            if (config.isPreLogger()) {
                log.info("Global filter start: request id -> {}", req.getId());
            }

            // custom post filter
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                if (config.isPostLogger()) {
                    log.info("Global filter end: response code -> {}", resp.getStatusCode());
                }
            }));

        });
    }

    @Data
    public static class Config {
        // put the configuration properties ..
        private String baseMessage;
        private boolean preLogger;
        private boolean postLogger;
    }
}
