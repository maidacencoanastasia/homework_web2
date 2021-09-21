package com.example.demo.controller;

import com.example.demo.mathOperators.Add;
import com.example.demo.mathOperators.Concat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex3 {
    @GetMapping("/ex3-add")
    public Integer add(@RequestBody Add numbers) {
        return numbers.a + numbers.b;
    }
    @GetMapping("/ex3-concat")
    public String concat(@RequestBody Concat concat ) {
        return concat.a + concat.b;
    }
}
