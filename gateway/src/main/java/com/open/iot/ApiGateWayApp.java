package com.open.iot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

 /**
  * 
 * @ClassName: ApiGateWayApp 
 * @Description: 网关启动
 * @author huy
 * @date 2019年7月28日 下午1:13:54 
 *
  */
@EnableCircuitBreaker
@SpringBootApplication
@EnableDiscoveryClient
public class ApiGateWayApp {
    public static void main(String[] args) {
        SpringApplication.run(ApiGateWayApp.class, args);
    }
}