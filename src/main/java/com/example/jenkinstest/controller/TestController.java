package com.example.jenkinstest.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/",produces = "application/json")
    public String myResponse() {
        return "success";
//        return new MyResponse(1L, "hello");
    }

    @NoArgsConstructor
    @AllArgsConstructor
    public static class MyResponse {
        private Long id;
        private String name;
    }

}
