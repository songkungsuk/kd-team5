package com.team5;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan
@ComponentScan
public class KdTeam5Application {

	public static void main(String[] args) {
		SpringApplication.run(KdTeam5Application.class, args);
	}

}
