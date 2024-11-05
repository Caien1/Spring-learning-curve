package com.example.springSecurity;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayStudent {

       private List <Student> students = new ArrayList<>(List.of(
        new Student(1, "tellio", 0),
        new Student(7, "Nancy", 0)
       ));
    @GetMapping("/student")
    public List <Student> getStudent(){
        System.out.println("bug bug");
        
        return students;
    }
    
}
