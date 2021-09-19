package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Ex1e {
    @GetMapping("ex1e")
    public String method5(HttpServletRequest httpServletRequest) {
        return "șirul de perechi nume=valoare (en. query string) a cererii HTTP - getQueryString: " + httpServletRequest.getQueryString();
    }
}
