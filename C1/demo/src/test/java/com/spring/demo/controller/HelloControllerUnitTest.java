package com.spring.demo.controller;

import com.spring.demo.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;
import static org.junit.Assert.*;

//TODO: use BindingAwareModelMap + Junit  to mock the MVC model
public class HelloControllerUnitTest {

    @Test
    public void sayHello() {
        HelloController controller = new HelloController();

        Model model = new BindingAwareModelMap();
        String result = controller.sayHello("hello", model);
        assertEquals("hello", result);
//        assertEquals("world", model.asMap().get("user"));
    }
}

//TODO: but you always want to check if the springboot make it easier .
//TODO: check auto config spring MVC test . class -> MockMVV