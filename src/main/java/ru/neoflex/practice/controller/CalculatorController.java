package ru.neoflex.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/plus/{a}/{b}")
    public String plus(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        String result = String.valueOf(a+b);
        return result;
    }
    @GetMapping("/minus/{a}/{b}")
    public String minus(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        String result = String.valueOf(a-b);
        return result;
    }
}
