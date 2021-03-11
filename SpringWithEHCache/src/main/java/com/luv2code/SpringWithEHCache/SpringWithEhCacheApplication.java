package com.luv2code.SpringWithEHCache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringWithEhCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWithEhCacheApplication.class, args);
	}

}
