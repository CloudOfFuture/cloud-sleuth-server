package com.kunlun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;


@EnableZipkinServer
@EnableDiscoveryClient
@SpringBootApplication
public class CloudSleuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudSleuthServerApplication.class, args);
	}
}
