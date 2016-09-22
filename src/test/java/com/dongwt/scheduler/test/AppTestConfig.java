package com.dongwt.scheduler.test;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(value = { "classpath*:spring-quartz.xml"})
public class AppTestConfig {

}
