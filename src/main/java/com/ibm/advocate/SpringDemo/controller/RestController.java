package com.ibm.advocate.SpringDemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "*", maxAge = 3600)
@org.springframework.web.bind.annotation.RestController
@RequestMapping("")
public class RestController {

    @GetMapping("/")
    public ResponseEntity<?> helloWorld(){
        return ResponseEntity.ok("Hello World");
    }
}
