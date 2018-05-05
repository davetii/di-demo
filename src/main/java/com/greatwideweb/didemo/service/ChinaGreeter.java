package com.greatwideweb.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class ChinaGreeter implements Greeting {
    @Override
    public String getGreeting() {
        return "Mi Hao";
    }
}
