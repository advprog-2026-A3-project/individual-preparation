package com.example.individualprep.service;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticUtility {

    public double add(double o1, double o2) {
        // TODO: Implement me properly!
        return 0.0;
    }

    public double subtract(double o1, double o2) {
        // TODO: Implement me properly!
        return 0.0;
    }

    public double multiply(double o1, double o2) {
        // TODO: Implement me properly!
        return 0.0;
    }

    public double divide(double o1, double o2) {
        // TODO: Implement me properly!
        return 0.0;
    }

    public double exponent(double o1, int n) {
        if (o1 == 0 && n < 0) {
            throw new IllegalArgumentException("0 cannot be raised to a negative power.");
        }

        double result = 1;

        if (n == 0) {
            return result;
        }

        int absN = Math.abs(n);

        for (int i = 0; i < absN; i++) {
            result *= o1;
        }

        if (n < 0) {
            return 1 / result;
        }

        return result;
    }
}