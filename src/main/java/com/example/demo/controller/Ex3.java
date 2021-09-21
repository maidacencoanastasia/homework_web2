package com.example.demo.controller;

import com.example.demo.mathOperators.Add;
import com.example.demo.mathOperators.Concat;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/ex3")
public class Ex3 {
    @PostMapping("/add")
    public Integer add(@RequestBody Add numbers) {
        return numbers.a + numbers.b;
    }
    @PostMapping("/concat")
    public String concat(@RequestBody Concat concat ) {
        return concat.a + concat.b;
    }
}
