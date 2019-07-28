package com.open.iot.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
* @ClassName: EurekaServerApp 
* @Description: 注册服务
* @author huy
* @date 2019年6月15日 上午10:31:49 
*
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApp {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApp.class, args);
	}

}