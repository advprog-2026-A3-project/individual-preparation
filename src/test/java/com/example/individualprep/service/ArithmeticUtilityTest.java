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

    void testArithmeticAdd() {
        ArithmeticUtility arithmeticUtility = new ArithmeticUtility();
        double result = arithmeticUtility.add(5.0, 3.0);
        assertEquals(8.0, result, 0.0001);
    }

    @Test
    void testExponentPositivePower() {
        ArithmeticUtility arithmeticUtility = new ArithmeticUtility();
        double result = arithmeticUtility.exponent(2, 3);
        assertEquals(8.0, result, 0.000001);
    }

    @Test
    void testExponentZeroPower() {
        ArithmeticUtility arithmeticUtility = new ArithmeticUtility();
        double result = arithmeticUtility.exponent(5, 0);
        assertEquals(1.0, result, 0.000001);
    }

    @Test
    void testExponentNegativePower() {
        ArithmeticUtility arithmeticUtility = new ArithmeticUtility();
        double result = arithmeticUtility.exponent(2, -2);
        assertEquals(0.25, result, 0.000001);
    }

    @Test
    void testNegativeBaseOddExponent() {
        ArithmeticUtility arithmeticUtility = new ArithmeticUtility();
        double result = arithmeticUtility.exponent(-2, 3);
        assertEquals(-8.0, result, 0.000001);
    }

    @Test
    void testNegativeBaseEvenExponent() {
        ArithmeticUtility arithmeticUtility = new ArithmeticUtility();
        double result = arithmeticUtility.exponent(-2, 2);
        assertEquals(4.0, result, 0.000001);
    }

    @Test
    void testZeroBasePositiveExponent() {
        ArithmeticUtility arithmeticUtility = new ArithmeticUtility();
        double result = arithmeticUtility.exponent(0, 3);
        assertEquals(0.0, result, 0.000001);
    }

    @Test
    void testZeroBaseZeroExponent() {
        ArithmeticUtility arithmeticUtility = new ArithmeticUtility();
        double result = arithmeticUtility.exponent(0, 0);
        assertEquals(1.0, result, 0.000001);
    }

    @Test
    void testZeroBaseNegativeExponentThrowsException() {
        ArithmeticUtility arithmeticUtility = new ArithmeticUtility();
        assertThrows(IllegalArgumentException.class, () -> {
            arithmeticUtility.exponent(0, -2);
        });
    }
}