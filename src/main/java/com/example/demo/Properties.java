package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Properties {

    @Value("${spring.datasource.username}")
    private String name;

    public String getName() {
        return name;
    }

}
