package com.greatwideweb.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingImpl implements Greeting {
    @Override
    public String getGreeting() {
        return "Hello";
    }
}
