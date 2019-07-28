package com.open.iot.server;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
public class AuthServerApp {
	public static void main(String[] args) {
        SpringApplication.run(AuthServerApp.class, args);
	}
}
