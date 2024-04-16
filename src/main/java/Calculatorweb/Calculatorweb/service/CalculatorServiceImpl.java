package Calculatorweb.Calculatorweb.service;

import Calculatorweb.Calculatorweb.exception.ZeroDivideException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl  implements CalculatorService{
    @Override
    public int sum(int num2, int num3) {
        return num2 + num3;
    }

    @Override
    public int subtract(int num2, int num3) {
        return num2 - num3;
    }

    @Override
    public int multiply(int num2, int num3) {
        return num2 * num3;
    }

    @Override
    public float divide(int num2, int num3) {
        if (num3==0){
            throw new ZeroDivideException();
        }
        return num2 / num3;
    }
}