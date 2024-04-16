package Calculatorweb.Calculatorweb.controller;

import Calculatorweb.Calculatorweb.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping
    public String hello() {
        return "Добро  пожаловать в калькулятор ";
    }
    @GetMapping( "/plus")
    public String sum(@RequestParam int num2, @RequestParam  int num3 ) {
        int result = service.sum(num2, num3);
        return  num2 +" + " + num3 + " = " + result;
    }
    @GetMapping( "/minus")
    public String subtract(@RequestParam int num2,@RequestParam  int num3 ) {
        int result = service.subtract(num2, num3);
        return  num2 +" - " + num3 + " = " + result;
    }
    @GetMapping( "/multiply")
    public String multiply(@RequestParam int num2,@RequestParam  int num3 ) {
        int result = service.multiply(num2, num3);
        return  num2 +" * " + num3 + " = " + result;
    }
    @GetMapping( "/divide")
    public String divide(@RequestParam int num2,@RequestParam  int num3 ) {
        float result = service.divide(num2, num3);
        return  num2 +" / " + num3 + " = " + result;
    }
}

