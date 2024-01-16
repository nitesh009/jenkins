package com.nkdebug.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class JenkinsController {
    @GetMapping("/getdata")
    public String getinfo(){
        return "This is Jenkins project";
    }
}
