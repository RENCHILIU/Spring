package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.NumberFormat;
import java.util.Locale;


@SpringBootApplication //TODO: telling Spring how to handle the application
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);  //TODO: From Springboot
    }

    @Bean //TODO: define a bean and use it in the testing
    public NumberFormat defaultCurrencyFormat() {
        return NumberFormat.getCurrencyInstance();
    }

    @Bean //TODO: define another bean to test @Autowired
    public NumberFormat anotherCurrencyFormat() {
        return NumberFormat.getCurrencyInstance(Locale.CHINA);
    }
}
