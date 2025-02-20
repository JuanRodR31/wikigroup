package com.wikigroup.wikigroup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.wikigroup.wikigroup.Repositories")
@ComponentScan(basePackages = "com.wikigroup.wikigroup")
@EntityScan(basePackages = "com.wikigroup.wikigroup.Entities")
public class WikigroupApplication {

    public static void main(String[] args) {
        SpringApplication.run(WikigroupApplication.class, args);
    }

}
