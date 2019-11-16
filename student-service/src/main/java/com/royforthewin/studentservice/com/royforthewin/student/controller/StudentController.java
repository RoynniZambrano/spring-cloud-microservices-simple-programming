package com.royforthewin.studentservice.com.royforthewin.student.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Value("${config.server.student-key}")
    private String propertyKey;

     @GetMapping
    public String fetchProperty(){
         return propertyKey;
     }

}
