package com.greatwideweb.didemo.controllers;

import com.greatwideweb.didemo.service.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SetterInjector {

    private Greeting greeting;

    @Autowired
    @Qualifier("mexicanGreeter")
    public void setGreeting(Greeting g) { greeting = g; }
    public String sayHello() { return greeting.getGreeting(); }
}
