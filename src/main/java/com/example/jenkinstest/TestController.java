package com.example.jenkinstest;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public MyResponse myResponse() {
        return new MyResponse(1L, "hello");
    }

    @NoArgsConstructor @AllArgsConstructor
    public static class MyResponse{
        private Long id;
        private String name;
    }
}
