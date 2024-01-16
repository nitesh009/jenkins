package com.nkdebug.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinController {
    @GetMapping("/greet")
    public String greet() {
        return "greetPage";
    }
}
