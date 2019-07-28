package com.open.iot.device;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringCloudApplication
public class DeviceCenterApp {

	public static void main(String[] args) {
		SpringApplication.run(DeviceCenterApp.class, args);
	}
}
