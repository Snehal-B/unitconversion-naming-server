package com.mms.api.unitconversionnamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class UnitconversionNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnitconversionNamingServerApplication.class, args);
	}

}
