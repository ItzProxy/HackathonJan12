package com.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyBff {

    public static void main(String[] args) {
        SpringApplication.run(MyBff.class, args);
    }

    @Bean
    public UserClient userClient() {
        return new UserClient();
    }

}
