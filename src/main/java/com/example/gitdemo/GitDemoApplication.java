package com.example.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitDemoApplication.class, args);
    }

    @GetMapping("/hello-spring")
    String greet() {
        return "Hello, Spring!";
    }

    @GetMapping("/hello")
    String test() {
        return "test";
    }
}
