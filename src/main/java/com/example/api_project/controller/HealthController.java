package com.example.api_project.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
public class HealthController {
    @GetMapping("/health")
    public String healthCheck() {
        LocalDateTime currentTime = LocalDateTime.now();
        return "Status: ok\nCurrent Time: " + currentTime;
    }
}
