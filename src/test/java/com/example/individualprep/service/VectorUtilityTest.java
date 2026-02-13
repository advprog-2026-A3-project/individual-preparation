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

    @Test
    void testDotProduct() {
        VectorUtility vectorUtility = new VectorUtility();
        double[] v1 = {1.0, 2.0, 3.0};
        double[] v2 = {4.0, 5.0, 6.0};

        double expectedResult = 32.0;
        double actualResult = vectorUtility.dotProduct(v1, v2);

        assertEquals(expectedResult, actualResult, 0.0001, "Hasil dot product salah!");
    }

    @Test
    void testDotProductZero() {
        VectorUtility vectorUtility = new VectorUtility();
        double[] v1 = {1.0, 0.0, 0.0};
        double[] v2 = {0.0, 1.0, 0.0};

        double expectedResult = 0.0;
        double actualResult = vectorUtility.dotProduct(v1, v2);

        assertEquals(expectedResult, actualResult, 0.0001, "Hasil dot product harus 0!");
    }

    @Test
    void testDotProductNegative() {
        VectorUtility vectorUtility = new VectorUtility();
        double[] v1 = {2.0, -3.0, 1.0};
        double[] v2 = {1.0, 4.0, -2.0};

        double expectedResult = -12.0;
        double actualResult = vectorUtility.dotProduct(v1, v2);

        assertEquals(expectedResult, actualResult, 0.0001, "Hasil dot product dengan nilai negatif salah!");
    }

    @Test
    void testDotProductNullVector() {
        VectorUtility vectorUtility = new VectorUtility();
        
        assertThrows(IllegalArgumentException.class, () -> {
            vectorUtility.dotProduct(null, new double[]{1.0, 2.0});
        }, "Harus throw exception untuk vector null!");
    }

    @Test
    void testDotProductDifferentLength() {
        VectorUtility vectorUtility = new VectorUtility();
        double[] v1 = {1.0, 2.0, 3.0};
        double[] v2 = {4.0, 5.0};

        assertThrows(IllegalArgumentException.class, () -> {
            vectorUtility.dotProduct(v1, v2);
        }, "Harus throw exception untuk vector dengan panjang berbeda!");
    }
}