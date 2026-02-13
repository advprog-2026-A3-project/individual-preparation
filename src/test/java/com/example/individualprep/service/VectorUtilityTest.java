package com.example.individualprep.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class VectorUtilityTest {

    private VectorUtility vectorUtility;

    @BeforeEach
    void setUp() {
        vectorUtility = new VectorUtility();
    }

    @Test
    void testVectorNorm_PositiveNumbers() {
        double[] vector = {3.0, 4.0};
        double result = vectorUtility.norm(vector);
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    void testVectorNorm_NegativeNumbers() {
        double[] vector = {-3.0, 4.0};
        double result = vectorUtility.norm(vector);
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    void testVectorNorm_ZeroVector() {
        double[] vector = {0.0, 0.0, 0.0};
        double result = vectorUtility.norm(vector);
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    void testMultiply() {
        double[] inputVector = {2.0, 5.0, -3.0};
        int scalar = 3;

        double[] expectedResult = {6.0, 15.0, -9.0};
        double[] actualResult = vectorUtility.multiply(inputVector, scalar);

        assertArrayEquals(expectedResult, actualResult, "Hasil perkalian vektor salah!");
    }
}