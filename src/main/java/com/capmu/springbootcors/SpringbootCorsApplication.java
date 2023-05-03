package com.capmu.springbootcors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@SpringBootApplication
public class SpringbootCorsApplication {

	@Bean
	public SecurityFilterChain chain(HttpSecurity http) throws Exception {
		http.cors();
		return http.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCorsApplication.class, args);
	}

}
