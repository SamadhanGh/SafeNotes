package com.safe.SafeNotes;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {

        return "Hello World";
    }

    @GetMapping("/contact")
    public String SayContact() {

        return "contact";
    }


}
