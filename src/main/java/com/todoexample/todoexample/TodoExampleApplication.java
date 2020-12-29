package com.todoexample.todoexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.todoexample.todoexample.repository")
@EntityScan(basePackages = "com.todoexample.todoexample.model")
@SpringBootApplication
public class TodoExampleApplication {

    public static void main(String[] args) {

        SpringApplication.run(TodoExampleApplication.class, args);
    }

}
