package com.cp_backend;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CpBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CpBackendApplication.class, args);
	}
	@Bean
	public ObjectMapper myMapper() {
		return new ObjectMapper().disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
	}

}
