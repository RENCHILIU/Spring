package com.spring.demo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.NumberFormat;

@RunWith(SpringRunner.class)  //TODO: Spring works perfect with Junit
@SpringBootTest  //TODO: Govern how the class works
public class DemoApplicationTests {

    @Autowired
    private ApplicationContext ctx;

    @Test
    public void contextLoads() {
        int count = ctx.getBeanDefinitionCount();
        //TODO: test the application context and check there are many beans
        System.out.println("There are " + count + " Beans in the application Context");
        for (String name : ctx.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }

    @Autowired //TODO: @Autowire infer by "Class Type" as default
    //TODO: if we have two NumberFormat , it cannot infer which one . so we need specify by @Qualifier
    @Qualifier("defaultCurrencyFormat")
    private NumberFormat nf;

    @Test
    public void testNumberFormat() {
        double amount = 12342343.32423423;
        System.out.println(nf.format(amount));
    }

    @Autowired @Qualifier("anotherCurrencyFormat")
    private NumberFormat anotherNf;

    @Test
    public void testAnotherNf() {
        double amount = 12342343.32423423;
        System.out.println(anotherNf.format(amount));
    }


}
