package com.jkobura.farkleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FarkleProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(FarkleProjectApplication.class, args);
    }

    @GetMapping
    public String helloWorld(){
        return "Hello mudafucka";
    }
}
