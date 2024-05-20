package com.pradip.service1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service1")
public class FirstServiceController {


// localhost:9000/service1/message   ==>   This is first service message returned

    @GetMapping("/message")
    public String message(){
        return "This is first service message returned";
    }


}
