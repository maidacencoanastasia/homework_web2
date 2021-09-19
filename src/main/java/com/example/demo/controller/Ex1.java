package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@RestController
public class Ex1 {
    @GetMapping("ex1")
    public String method1(HttpServletRequest httpServletRequest) {
        return "getServletPath: " + httpServletRequest.getServletPath();
    }
}
