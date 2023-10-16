package com.fiap.f58.food;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodApplication {

    private static final Logger log = LoggerFactory.getLogger(FoodApplication.class);

    public static void main(String[] args) {
        log.info("In main Method!");
        SpringApplication.run(FoodApplication.class, args);
    }

}
