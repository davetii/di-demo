package com.greatwideweb.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class MexicanGreeter implements Greeting {
    @Override
    public String getGreeting() {
        return "Hola Pendejo";
    }
}
