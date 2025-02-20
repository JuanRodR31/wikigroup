package com.wikigroup.wikigroup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.wikigroup.wikigroup.Entities")
@EnableJpaRepositories("com.wikigroup.wikigroup.Repositories")
public class WikigroupApplication {
	public static void main(String[] args) {
		SpringApplication.run(WikigroupApplication.class, args);
	}
}
