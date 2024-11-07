package com.example.springSecurity.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springSecurity.model.Student;

@RestController
public class StudentController {

       private List <Student> students = new ArrayList<>(List.of(
        new Student(1, "tellio", 0),
        new Student(7, "Nancy", 0)
       ));
    @GetMapping("/student")
    public List <Student> getStudent(){
        System.out.println("bug bug");
        
        return students;
    }
   
    @PostMapping("/student")
    public Student makeStudent(@RequestBody Student student){

        students.add(student);
        return student;


        
    }
}
