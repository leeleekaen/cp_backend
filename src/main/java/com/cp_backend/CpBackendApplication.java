package com.cp_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CpBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CpBackendApplication.class, args);
	}

	// 解决对象转json报错问题。
//	@Bean
//	public ObjectMapper myMapper() {
//		return new ObjectMapper().disable(SerializationFeature);
//	}

}
