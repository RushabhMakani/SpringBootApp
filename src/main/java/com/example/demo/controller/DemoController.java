package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class DemoController {

    @GetMapping("ping")
    public ResponseEntity<String> getPing() {
        return ResponseEntity.ok("pong");
    }

    @GetMapping("time")
    public ResponseEntity<LocalDateTime> getTime() {
        return ResponseEntity.ok(LocalDateTime.now());
    }


    @GetMapping("ip")
    public ResponseEntity<HttpServletRequest> getSession(HttpServletRequest request) {
        return ResponseEntity.ok(request);
    }
}
