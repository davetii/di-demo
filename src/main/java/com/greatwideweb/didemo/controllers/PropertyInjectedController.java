package com.greatwideweb.didemo.controllers;

import com.greatwideweb.didemo.service.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PropertyInjectedController {

    @Autowired
    @Qualifier("chinaGreeter")
    private Greeting greeting;

    public String sayHello() { return greeting.getGreeting(); }
}
