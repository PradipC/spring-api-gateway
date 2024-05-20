package com.pradip.service2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service2")
public class SecondServiceController {

// localhost:9001/service2/message   ==>   This is second service message returned


    @GetMapping("/message")
    public String message(){
        return "This is second service message returned";
    }


}
