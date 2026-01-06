package io.github.puzzler2424.ai_audit_log;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello() {
        return "AI Audit Log Server is Running";
    }
}