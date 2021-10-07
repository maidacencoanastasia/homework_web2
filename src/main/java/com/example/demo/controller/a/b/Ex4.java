package com.example.demo.controller.a.b;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "a/b")
public class Ex4 {

    @GetMapping
    public ResponseEntity<Map> parentNode(HttpServletRequest request) {
        Map<String, String> parth = new HashMap<>();
        parth.put("c", request.getRequestURL() + "/c");
        parth.put("d", request.getRequestURL() + "/d");
        parth.put("x", request.getRequestURL() + "/x");
        parth.put("y", request.getRequestURL() + "/y");
        return ResponseEntity.ok(parth);
    }

    @RequestMapping(value = {"/c"}, method = RequestMethod.GET)
    public ResponseEntity<String> childOne() {

        return ResponseEntity.ok("c");
    }

    @RequestMapping(value = {"/d"}, method = RequestMethod.GET)
    public ResponseEntity<String> childTwo() {
        return ResponseEntity.ok("d");
    }

    @RequestMapping(value = {"/c/x"}, method = RequestMethod.GET)
    public ResponseEntity<String> childThree() {
        return ResponseEntity.ok("child-three");
    }

    @RequestMapping(value = {"/d/**/y"}, method = RequestMethod.GET)
    public ResponseEntity<String> childFour() {
        return ResponseEntity.ok("child-four");
    }
}
