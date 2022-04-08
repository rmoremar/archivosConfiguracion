package com.nttdata.bootcamp_spring_cloud_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BootcampSpringCloudEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcampSpringCloudEurekaApplication.class, args);
		System.out.println("Eureka Mundo!");
	}

}
