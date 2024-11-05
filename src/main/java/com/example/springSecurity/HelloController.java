package com.example.springSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class HelloController {
   @GetMapping("/")
   public String greet(){
    return "Hello whats up";
   }


   @RestController
   public class BlueButton 
   {

    @GetMapping("/b")

    public String greet(){
        return "Endpoint two";
    }
   
    
   }
}
