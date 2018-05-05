package com.greatwideweb.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("english")
public class DefaultGreeter implements Greeting {
    @Override
    public String getGreeting() {
        return "Hello from Default";
    }
}
