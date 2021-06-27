package com.dh.sp.core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.dh.sp.core")
@PropertySource("classpath:application.properties")
public class SpringConfig {
}
