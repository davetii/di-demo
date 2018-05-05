package com.greatwideweb.didemo.controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class MyController {

    public String hello() {
        return "hello";
    }
}
