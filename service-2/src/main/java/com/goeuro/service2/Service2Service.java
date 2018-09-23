package com.goeuro.service2;

import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Service2Service {

    public String process() {
        log.info("processing");
        return UUID.randomUUID().toString();
    }
}
