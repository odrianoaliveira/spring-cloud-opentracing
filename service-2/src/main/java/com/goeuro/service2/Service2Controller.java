package com.goeuro.service2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Service2Controller {
    private final Service2Service service2Service;

    public Service2Controller(Service2Service service2Service) {
        this.service2Service = service2Service;
    }

    @RequestMapping("/message")
    public String message() {
        log.info("message from service 2.");
        return service2Service.process();
    }
}
