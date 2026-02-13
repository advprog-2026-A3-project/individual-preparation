package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VectorUtilityTest {

    @Test
    void testMultiply() {
        VectorUtility vectorUtility = new VectorUtility();
        double[] inputVector = {2.0, 5.0, -3.0};
        int scalar = 3;

        double[] expectedResult = {6.0, 15.0, -9.0};
        double[] actualResult = vectorUtility.multiply(inputVector, scalar);

        assertArrayEquals(expectedResult, actualResult, "Hasil perkalian vektor salah!");
    }
}