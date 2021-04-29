package com.example.SpringBootProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class Sample {
        @GetMapping(value = "/hello")
        public String hello(){
            return "Hii Spring Boot";
        }
}
