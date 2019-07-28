package com.open.iot.client.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

/**
 * 
* @ClassName: RequestRateLimiterConfig 
* @Description: 限流控制
* @author huy
* @date 2019年7月28日 下午1:13:18 
*
 */
@Configuration
public class RequestRateLimiterConfig {

    /**
     * 根据 addr 进行限流
     * @return
     */
    @Bean("ipAddressKeyResolver")
    public KeyResolver ipAddressKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getAddress().getHostAddress());
    }
    
}
