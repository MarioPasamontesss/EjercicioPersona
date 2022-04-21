package com.example.demo;

import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class Controlador1 {

    /*@GetMapping("/user")
    public String getUser(){
        return "Mario";
    }*/

    @PostMapping("/useradd")
    public String getUser1(@RequestBody @NotNull Persona pe){
        return pe.toString();
    }
}
