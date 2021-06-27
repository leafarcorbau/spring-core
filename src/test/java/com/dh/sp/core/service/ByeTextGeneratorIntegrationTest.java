package com.dh.sp.core.service;

import static java.lang.String.format;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ByeTextGeneratorIntegrationTest {

    @Autowired
    private ByeTextGenerator byeTextGenerator;

    @Test
    public void shouldGenerateHelloText() {
        //Given
        final String msg = UUID.randomUUID().toString();
        final String expected = format("TextGeneratorService message: Bye %s", msg);

        //When
        final String result = byeTextGenerator.generateText(msg);

        //Then
        assertEquals(expected, result);
    }
}
