package com.home.demos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class SpringCloudFunctionApplication {

    public static void main(String[] args) {
        SpringApplication.run(
                SpringCloudFunctionApplication.class, args);
    }

    @Bean
    public Supplier<String> greeting() {
        return () -> "Hello default user from cloud function deployed on AWS";
    }


    @Bean
    public Function<String, String> greetingByName() {
        return input -> String.format("Hello %s from cloud function deployed on AWS", input);
    }
}
