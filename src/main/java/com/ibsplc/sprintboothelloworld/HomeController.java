package com.ibsplc.sprintboothelloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${app.version:v1}")
    public String version;

    @Value("${app.message:Hello from DevOps JAVA App!}")
    public String message;

    @GetMapping("/")
    public String home(){
        return message;
    }

    @GetMapping("/version")
    public String version(){
            return "Version: "+ version;
        }

        @GetMapping("/health")
        public String health(){
            return "OK";
    }
}
