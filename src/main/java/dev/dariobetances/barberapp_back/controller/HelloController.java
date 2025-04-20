package dev.dariobetances.barberapp_back.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //Endpoint: Test
    @GetMapping("/hello")
    public String hello() {
        return "Successfully Hello World!";
    }
}
