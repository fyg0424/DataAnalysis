package com.shijie99.TestJava.bootstrap.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath:spring-mybatis.xml"})
@EnableAspectJAutoProxy(proxyTargetClass=false)
public class DatabaseConfiguration {

}
