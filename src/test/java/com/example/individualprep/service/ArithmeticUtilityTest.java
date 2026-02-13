package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticUtilityTest {

    @Test
    void testArithmeticAdd() {
        ArithmeticUtility arithmeticUtility = new ArithmeticUtility();
        double result = arithmeticUtility.add(5.0, 3.0);
        assertEquals(8.0, result, 0.0001);
    }
}