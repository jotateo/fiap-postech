package com.fiap.postech.food58;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Food58Application {

    public static void main(String[] args) {
        SpringApplication.run(Food58Application.class, args);
    }

    @GetMapping("/version")
    public String aboutVersion() {
        return "Food58 v0.0.1";
    }

}
