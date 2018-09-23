package com.goeuro.service1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class Service1Controller {

    private final RestTemplate restTemplate;

    public Service1Controller(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping("/message")
    public String message() {
        log.info("message from service 1.");
        return "message-1";
    }

    @RequestMapping("/chaining")
    public String chaining() {
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://localhost:8082/message", String.class);
        log.info("message from service 2." + forEntity.getBody());
        return "message-1";
    }
}
