package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@RestController

public class Ex2 {
    @GetMapping("ex2a")
    public Cookie[] method1(HttpServletRequest httpServletRequest) {
        return httpServletRequest.getCookies();
    }

    @GetMapping("ex2b")
    public String method2(HttpServletRequest httpServletRequest) {
        return "lista de antete cerere - getHeader  "+httpServletRequest.getHeader("headers");
    }

    @GetMapping("ex2c")
    public String method3(HttpServletRequest httpServletRequest) {
        return "lista de parametri din query string - getHeaderNames()  "+httpServletRequest.getHeaderNames().toString();
    }
}
