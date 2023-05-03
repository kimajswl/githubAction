package com.example.githubaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GithubActionApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubActionApplication.class, args);
    }

    @GetMapping("/home")
    public String test() {
        return "Hello World";
    }

}
