package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {

    @Test
    void testAdd(){
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2,3));
    }

    @Test
    void testSubtract(){
        Calculator calc = new Calculator();
        assertEquals(4, calc.subtract(8, 4));
    }
}
