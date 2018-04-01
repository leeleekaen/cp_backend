package com.cp_backend.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/hello")
    public String hello () throws Exception{
        Process process  =Runtime.getRuntime().exec("G:/dcmp-decryption.exe -func=mac");
        System.out.println(process.toString());
        return "hello SpringBoot";
    }
}
