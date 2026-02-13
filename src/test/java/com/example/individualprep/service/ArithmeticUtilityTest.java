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
}