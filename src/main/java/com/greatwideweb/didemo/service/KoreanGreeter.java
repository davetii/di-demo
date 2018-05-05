package com.greatwideweb.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("korea")
@Primary
public class KoreanGreeter implements Greeting {
    @Override
    public String getGreeting() {
        return "An yon Hasayo";
    }
}
