package ru.neoflex.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.neoflex.practice.model.Calculations;
import ru.neoflex.practice.service.CalculationsService;

@RestController
public class CalculatorController {
//    @Autowired
//    private CalculatiomsRepository calculatiomsRepository;
    @Autowired
    private final CalculationsService service;

    public CalculatorController(CalculationsService service) {
        this.service = service;
    }

    @GetMapping("/plus/{a}/{b}")
    public String plus(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        String result = String.valueOf(a+b);
        String expression = a + " + " + b;
        Calculations calculation = new Calculations(expression, result);
        service.insert(calculation);
        return result;
    }
    @GetMapping("/minus/{a}/{b}")
    public String minus(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        String result = String.valueOf(a-b);
        String expression = a + " - " + b;
        Calculations calculation = new Calculations(expression, result);
        service.insert(calculation);
        return result;
    }
}
