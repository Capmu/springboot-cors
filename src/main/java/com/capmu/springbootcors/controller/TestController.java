package com.capmu.springbootcors.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<Map<String, String>> testApi() {
        Map<String, String> sampleResponse = new HashMap<>();
        sampleResponse.put("message", "Hello, this is Capmu!");
        return ResponseEntity.ok(sampleResponse);
    }

}
