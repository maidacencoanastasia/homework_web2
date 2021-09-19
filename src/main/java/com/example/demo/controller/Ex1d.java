package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Ex1d {
    @GetMapping("ex1d")
    public String method4(HttpServletRequest httpServletRequest) {
        return "partea adresei din cerere fără protocol și șirul de perechi - getContextPath: " + httpServletRequest.getContextPath();
    }
}
