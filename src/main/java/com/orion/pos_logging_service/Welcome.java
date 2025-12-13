package com.orion.pos_logging_service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    private static final Logger logger = LoggerFactory.getLogger(Welcome.class);

    @GetMapping("/welcome")
    public String welcome(){
        logger.info("calling welcome endpoint");
        return "Hello";
    }
}
