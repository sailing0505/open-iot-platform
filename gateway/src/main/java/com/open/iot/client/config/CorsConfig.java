package com.open.iot.client.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.cors.reactive.CorsUtils;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;

import reactor.core.publisher.Mono;

/**
 * 
* @ClassName: CorsConfig 
* @Description: 网关跨域，各个微服务要关闭此操作，只在网关做，避免重复
* @author huy
* @date 2019年7月28日 下午1:12:03 
*
 */
@Configuration
public class CorsConfig {
	
	
	//这里为支持的请求头，如果有自定义的header字段请自己添加（不知道为什么不能使用*）x-requested-with, authorization, Content-Type, Authorization, credential, X-XSRF-TOKEN,token,username,client,Accept,Content-Type,Origin,Referer,User-Agent,Authorization
	//Access-Control-Allow-Headers, Origin,Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Authorization , Access-Control-Request-Headers,credential,X-XSRF-TOKEN,User-Agent,Referer
	//先设置成*
    private static final String ALLOWED_HEADERS = "*";
    private static final String ALLOWED_METHODS = "*";//"POST, GET, OPTIONS, PUT, PATCH, DELETE";
    private static final String ALLOWED_ORIGIN = "*";
    private static final String ALLOWED_Expose = "*";
    private static final String MAX_AGE = "18000L";

	@Bean
	public WebFilter corsFilter() {
		return (ServerWebExchange ctx, WebFilterChain chain) -> {
			ServerHttpRequest request = ctx.getRequest();
			if (!CorsUtils.isCorsRequest(request)) {
				return chain.filter(ctx);
			}

			ServerHttpResponse response = ctx.getResponse();
			HttpHeaders headers = response.getHeaders();
			headers.add("Access-Control-Allow-Origin", ALLOWED_ORIGIN);
			headers.add("Access-Control-Allow-Methods", ALLOWED_METHODS);
			headers.add("Access-Control-Max-Age", MAX_AGE);
			headers.add("Access-Control-Allow-Headers", ALLOWED_HEADERS);
			headers.add("Access-Control-Expose-Headers", ALLOWED_Expose);
			headers.add("Access-Control-Allow-Credentials", "true");
			if (request.getMethod() == HttpMethod.OPTIONS) {
				response.setStatusCode(HttpStatus.OK);
				return Mono.empty();
			}
            return chain.filter(ctx);
		};
	}
	
	
}
