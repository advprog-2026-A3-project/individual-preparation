package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticUtilityTest {

    @Test
    void testMultiply() {
        ArithmeticUtility arithmeticUtility = new ArithmeticUtility();
        double operand1 = 5.0;
        double operand2 = 3.0;

        double expectedResult = 15.0;
        double actualResult = arithmeticUtility.multiply(operand1, operand2);

        assertEquals(expectedResult, actualResult, "Hasil perkalian aritmatika salah!");
    }

    @Test
    void testArithmeticAdd() {
        ArithmeticUtility arithmeticUtility = new ArithmeticUtility();
        double result = arithmeticUtility.add(5.0, 3.0);
        assertEquals(8.0, result, 0.0001);
    }
}