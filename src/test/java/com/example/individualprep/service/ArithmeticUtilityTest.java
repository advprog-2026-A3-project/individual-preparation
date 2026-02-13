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
    void testSubtract() {
        ArithmeticUtility arithmeticUtility = new ArithmeticUtility();
        double operand1 = 10.0;
        double operand2 = 3.0;

        double expectedResult = 7.0;
        double actualResult = arithmeticUtility.subtract(operand1, operand2);

        assertEquals(expectedResult, actualResult, 0.0001, "Hasil pengurangan salah!");
    }

    @Test
    void testSubtractNegativeResult() {
        ArithmeticUtility arithmeticUtility = new ArithmeticUtility();
        double operand1 = 5.0;
        double operand2 = 8.0;

        double expectedResult = -3.0;
        double actualResult = arithmeticUtility.subtract(operand1, operand2);

        assertEquals(expectedResult, actualResult, 0.0001, "Hasil pengurangan dengan hasil negatif salah!");
    }

    @Test
    void testSubtractZero() {
        ArithmeticUtility arithmeticUtility = new ArithmeticUtility();
        double operand1 = 5.0;
        double operand2 = 5.0;

        double expectedResult = 0.0;
        double actualResult = arithmeticUtility.subtract(operand1, operand2);

        assertEquals(expectedResult, actualResult, 0.0001, "Hasil pengurangan harus 0!");
    }

    @Test
    void testSubtractDecimals() {
        ArithmeticUtility arithmeticUtility = new ArithmeticUtility();
        double operand1 = 10.5;
        double operand2 = 3.2;

        double expectedResult = 7.3;
        double actualResult = arithmeticUtility.subtract(operand1, operand2);

        assertEquals(expectedResult, actualResult, 0.0001, "Hasil pengurangan dengan desimal salah!");
    }
}