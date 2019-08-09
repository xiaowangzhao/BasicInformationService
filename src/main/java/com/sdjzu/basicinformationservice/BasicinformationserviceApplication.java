package com.sdjzu.basicinformationservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sdjzu.basicinformationservice.dao")
public class BasicinformationserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicinformationserviceApplication.class, args);
	}

}
