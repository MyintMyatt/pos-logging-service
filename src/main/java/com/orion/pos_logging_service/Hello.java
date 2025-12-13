package com.orion.pos_logging_service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    private static final Logger logger = LoggerFactory.getLogger(Hello.class);

    @GetMapping("/hello")
    public String hello(){
        logger.info("calling hello endpoint");
        return "Hello";
    }




}
