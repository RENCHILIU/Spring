package com.spring.demo; //TODO: work below the root path , componentScan

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //TODO: @Controller already has the @Component annotation
public class HelloController {

    @GetMapping("/hello") //TODO: response GET request
    public String sayHello(
            @RequestParam(defaultValue = "World", required = false) String name,
            Model model) {  //TODO: MVC model

        model.addAttribute("user", name);
        return "hello";
    }

}
