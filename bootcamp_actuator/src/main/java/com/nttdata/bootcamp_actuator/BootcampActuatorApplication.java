package com.nttdata.bootcamp_actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class BootcampActuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcampActuatorApplication.class, args);
		System.out.println("Ya!!!");
	}

}
