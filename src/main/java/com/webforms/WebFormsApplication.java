package com.webforms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@SpringBootApplication
@ComponentScan(basePackages = {"com.webforms"})
@EntityScan(basePackageClasses = {WebFormsApplication.class, Jsr310JpaConverters.class})
public class WebFormsApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebFormsApplication.class, args);
    }
    //use --spring.profiles.active=h2 in program arguments for h2 db



}