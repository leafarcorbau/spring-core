package com.dh.sp.core.service;

import static java.lang.String.format;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ByeTextGenerator implements TextGenerator{
    @Autowired
    private BaseTextGenerator baseTextGenerator;
    
    public String generateText(final String msg){
        return baseTextGenerator.generateText(format("Bye %s",msg));
    }
}
