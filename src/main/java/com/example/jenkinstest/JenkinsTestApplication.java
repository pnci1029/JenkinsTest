package com.example.jenkinstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsTestApplication.class, args);
        for (int i = 0; i < 12; i++) {
            System.out.println(i);
        }
    }

}
