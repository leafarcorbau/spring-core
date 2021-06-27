package com.dh.sp.core.service;

import static java.lang.String.format;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BaseTextGenerator implements TextGenerator {

    @Value("${dh.sp.core.base.msg}")
    private String baseMsg;

    public String generateText(final String msg){
        return format(baseMsg,msg);
    }

    public void setBaseMsg(final String baseMsg) {
        this.baseMsg = baseMsg;
    }
}
