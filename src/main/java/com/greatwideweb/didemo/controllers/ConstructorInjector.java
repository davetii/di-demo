package com.greatwideweb.didemo.controllers;

import com.greatwideweb.didemo.service.Greeting;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjector {

    private Greeting greeting;
    public ConstructorInjector( Greeting g) { greeting = g; }
    public String sayHello() { return greeting.getGreeting(); }
}
