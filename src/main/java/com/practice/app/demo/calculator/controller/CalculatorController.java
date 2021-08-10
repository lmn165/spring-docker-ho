package com.practice.app.demo.calculator.controller;

import com.practice.app.demo.calculator.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequiredArgsConstructor
public final class CalculatorController {
    private final CalculatorService calculatorService;
}
