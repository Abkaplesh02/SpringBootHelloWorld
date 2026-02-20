package com.ibsplc.sprintboothelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Hello from DevOps JAVA App:) 🚀";
    }

    @GetMapping("/version")
    public String version(){
            return "Version 1.0.0";
        }

        @GetMapping("/health")
        public String health(){
            return "Application is healthy!";
    }
}
