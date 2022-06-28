package com.tw.training;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApp {
	final static Logger logger = LoggerFactory.getLogger(EurekaApp.class);

	public static void main(String[] args) {
		SpringApplication.run(EurekaApp.class, args);
		logger.debug("eureka已经启动!");
	}
}
