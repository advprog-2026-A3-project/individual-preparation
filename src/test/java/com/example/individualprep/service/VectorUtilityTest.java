package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VectorUtilityTest {

    @Autowired
    private VectorUtility vectorUtility;

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
}
