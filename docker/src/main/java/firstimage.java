package com.example.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class firstimage {
    @GetMapping ("/image")
    public String getData() { return "My first docker image" ;}

}
