package io.github.kewne.springbootissue14131;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootIssue14131Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootIssue14131Application.class, args);
	}
}
