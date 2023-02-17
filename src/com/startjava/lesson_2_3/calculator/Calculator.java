package com.startjava.lesson_2_3.calculator;

public class Calculator {
    double calculate(int a, int b, char sign) {
        switch (sign) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    System.out.println("Error: cannot divide by zero");
                    return 0;
                }
                return a / b;
            case '^':
                return power(a, b);
            case '%':
                if (b == 0) {
                    System.out.println("Error: cannot divide by zero");
                    return 0;
                }
                return a % b;
            default:
                System.out.println("Error: unknown sign " + sign);
        }
        return 0;
    }

    double power(int number, int pow) {
        double result = 1;
        if (pow > 0) {
            for (int i = 1; i <= pow; i++) {
                result *= number;
            }
        } else {
            for (int i = -1; i >= pow; i--) {
                result /= number;
            }
        }
        return result;
    }
}
