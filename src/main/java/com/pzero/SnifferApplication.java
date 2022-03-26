package com.pzero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SnifferApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnifferApplication.class, args);
    }
}
