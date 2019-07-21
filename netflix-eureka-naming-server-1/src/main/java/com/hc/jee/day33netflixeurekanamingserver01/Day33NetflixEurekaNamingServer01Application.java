package com.hc.jee.day33netflixeurekanamingserver01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Day33NetflixEurekaNamingServer01Application {

	public static void main(String[] args) {
		SpringApplication.run(Day33NetflixEurekaNamingServer01Application.class, args);
	}

}
