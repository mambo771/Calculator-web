package Calculatorweb.Calculatorweb.service;

import Calculatorweb.Calculatorweb.exception.ZeroDivideException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Calculatorweb.Calculatorweb.CalculatorConstains.*;
class CalculatorServiceImplTest {
    private final CalculatorServiceImpl service= new CalculatorServiceImpl();

    @Test
    void shouldReturnCorrectSum1() {
        assertEquals(ONE+TWO, service.sum(ONE,TWO));
    }
    @Test
    void shouldReturnCorrectSum2() {
        assertEquals(THREE+TWO, service.sum(THREE,TWO));
    }
    @Test
    void shouldReturnCorrectSub1() {
        assertEquals(THREE-TWO, service.subtract(THREE,TWO));
    }
    @Test
    void shouldReturnCorrectSub2() {
        assertEquals(TWO-ONE, service.subtract(TWO,ONE));
    }

    @Test
    void shouldReturnCorrectMultiply1() {
        assertEquals(TWO*ONE, service.multiply(TWO,ONE));
    }
    @Test
    void shouldReturnCorrectMultiply2() {
        assertEquals(TWO*TWO, service.multiply(TWO,TWO));
    }
    @Test
    void shouldReturnCorrectDivide1() {
        assertEquals(TWO/TWO, service.divide(TWO,TWO));
    }
    @Test
    void shouldReturnCorrectDivide2() {
        assertEquals(THREE/ONE, service.divide(THREE,ONE));
    }
    @Test
    void  shouldThrowZeroDivideException(){
        assertThrows(ZeroDivideException.class,()-> service.divide(THREE,ZERO));
    }
}