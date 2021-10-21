package com.example.demo.controller;

import com.example.demo.mathOperators.Add;
import com.example.demo.mathOperators.Concat;
import com.example.demo.mathOperators.Op;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/ex3")
public class Ex3 {
    @GetMapping("/add")
    public Integer add(@RequestBody Add numbers) {
        return numbers.a + numbers.b;
    }

    @GetMapping("/concat")
    public String concat(@RequestBody Concat concat) {
        return concat.a + concat.b;
    }

    @GetMapping("/op")
    public Double op(@RequestBody Op numbers) {
        double result = 0;
        switch (numbers.operation) {
            case "+":
                result = numbers.a + numbers.b;
                break;
            case "-":
                result = numbers.a - numbers.b;
                break;
            case "*":
                result = numbers.a * numbers.b;
                break;
            case "/":
                result = (double)numbers.a / (double)numbers.b;
                break;
            default:
                System.out.println("unknown operator, you can choose = - * /");
                break;
        }
        return result;
    }
    @GetMapping
    public String[] concatGet(HttpServletRequest request) {
        return request.getRequestURI().split("/");
    }
}
