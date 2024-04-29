package Calculatorweb.Calculatorweb.service;

import Calculatorweb.Calculatorweb.exception.ZeroDivideException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Calculatorweb.Calculatorweb.CalculatorConstans.*;
class CalculatorServiceImplTest {
    private final CalculatorServiceImpl service= new CalculatorServiceImpl();

    @Test
    void shouldReturnCorrectSum1() {
        int result= service.sum(ONE,TWO);
        assertEquals(ONE+TWO, result);
    }
    @Test
    void shouldReturnCorrectSum2() {
        int result= service.sum(THREE,TWO);
        assertEquals(THREE+TWO,result);
    }
    @Test
    void shouldReturnCorrectSub1() {
        int result= service.subtract(THREE,TWO);
        assertEquals(THREE-TWO,result);
    }
    @Test
    void shouldReturnCorrectSub2() {
        int result= service.subtract(TWO,ONE);
        assertEquals(TWO-ONE, result);
    }

    @Test
    void shouldReturnCorrectMultiply1() {
        int result= service.multiply(TWO,ONE);
        assertEquals(TWO*ONE, result);
    }
    @Test
    void shouldReturnCorrectMultiply2() {
        int result= service.multiply(TWO,TWO);
        assertEquals(TWO*TWO, result);
    }
    @Test
    void shouldReturnCorrectDivide1() {
        int result= service.divide(TWO,TWO);
        assertEquals(TWO/TWO, result);
    }
    @Test
    void shouldReturnCorrectDivide2() {
        int result= service.divide(THREE,ONE);
        assertEquals(THREE/ONE, result);
    }
    @Test
    void  shouldThrowZeroDivideException(){
        assertThrows(ZeroDivideException.class,()-> service.divide(THREE,ZERO));
    }
}