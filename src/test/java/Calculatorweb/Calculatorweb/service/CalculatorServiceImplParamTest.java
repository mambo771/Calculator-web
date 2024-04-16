package Calculatorweb.Calculatorweb.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static Calculatorweb.Calculatorweb.CalculatorConstains.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceImplParamTest {
    private final CalculatorServiceImpl service = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParam")
    void shouldReturnCorrectSum(int num1, int num2) {
        assertEquals(num1 + num2, service.sum(num1, num2));
    }
    @ParameterizedTest
    @MethodSource("provideParam")
    void shouldReturnCorrectSub(int num1, int num2) {
        assertEquals(num1 - num2, service.subtract(num1, num2));
    }
    @ParameterizedTest
    @MethodSource("provideParam")
    void shouldReturnCorrectMultiply(int num1, int num2) {
        assertEquals(num1 * num2, service.multiply(num1, num2));
    }
    @ParameterizedTest
    @MethodSource("provideParam")
    void shouldReturnCorrectDivide(int num1, int num2) {
        assertEquals(num1 / num2, service.divide(num1, num2));
    }
    private static Stream<Arguments> provideParam() {
        return Stream.of(
                Arguments.of(ZERO, ONE),
                Arguments.of(ONE, ONE),
                Arguments.of(THREE, ONE),
                Arguments.of(TWO, TWO),
                Arguments.of(THREE, THREE)
        );
    }
}
