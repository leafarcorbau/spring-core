package com.dh.sp.core.service;

import static java.lang.String.format;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.UUID;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BaseTextGeneratorTest {

    public static final String BASE_MSG = "TextGeneratorService message: %s";
    private BaseTextGenerator baseTextGenerator;

    @BeforeEach
    public void init(){
        baseTextGenerator = new BaseTextGenerator();
        baseTextGenerator.setBaseMsg(BASE_MSG);
    }

    @Test
    public void shouldGenerateText() {
        //Given
        final String msg = UUID.randomUUID().toString();
        final String expected = format("TextGeneratorService message: %s", msg);

        //When
        final String result = baseTextGenerator.generateText(msg);

        //Then
        assertEquals(expected, result);
    }
}
