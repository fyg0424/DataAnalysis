package com.shijie99.TestJava.bootstrap.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = { "com.shijie99.TestJava" })
public class BeanConfiguration {

}
