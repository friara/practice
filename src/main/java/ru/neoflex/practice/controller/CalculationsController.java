package ru.neoflex.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.neoflex.practice.model.Calculations;
import ru.neoflex.practice.service.CalculationsService;
import ru.neoflex.practice.swaggerAnnotations.GetAllCalculations;

@RestController
public class CalculationsController {

    @Autowired
    private final CalculationsService service;

    public CalculationsController(CalculationsService service) {
        this.service = service;
    }

    @GetAllCalculations
    @GetMapping("/calculations")
    public String calculations() {
        StringBuilder calculations = new StringBuilder();
        for (Calculations calculation : service.getAll()) {
            calculations.append(calculation.getExpression()).append(" = ").append(calculation.getResult()).append('\n');
        }
        return calculations.toString();
    }
}
