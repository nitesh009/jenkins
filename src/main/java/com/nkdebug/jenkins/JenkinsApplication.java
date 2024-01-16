package com.nkdebug.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@SpringBootApplication
public class JenkinsApplication {

	static Logger logger = LoggerFactory.getLogger(JenkinsApplication.class);

	@PostConstruct
	public void test() {
		logger.info("Application Started");
	}

	@GetMapping("/getmessage")
	public String myMethod() {
		return "HI this is me";
	}
	public static void main(String[] args) {
		logger.info("Application executed");
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
