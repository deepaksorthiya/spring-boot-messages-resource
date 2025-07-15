package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MessageResourceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessageResourceServerApplication.class, args);
    }

    @GetMapping("/")
    public String index(@AuthenticationPrincipal Jwt jwt) {
		System.out.println(jwt);
        return String.format("Hello, %s!", jwt.getSubject());
    }


}
