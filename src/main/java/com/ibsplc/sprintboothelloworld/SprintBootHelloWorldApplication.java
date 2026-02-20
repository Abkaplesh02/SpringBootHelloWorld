package com.ibsplc.sprintboothelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SprintBootHelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprintBootHelloWorldApplication.class, args);
        System.out.println("Application started successfully! 🚀");
    }

}
