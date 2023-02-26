package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    static double calculate(String expression) {
        String[] arguments = expression.split(" ");
        if (arguments.length != 3) throw new IllegalArgumentException("Incorrect math expression");
        double a = Integer.parseInt(arguments[0]);
        double b = Integer.parseInt(arguments[2]);
        if( a <= 0 || b <= 0) throw new IllegalArgumentException("Numbers must be positive");
        return switch (arguments[1]) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            case "^" -> Math.pow(a, b);
            case "%" -> a % b;
            default -> throw new IllegalArgumentException("Incorrect math sign");
        };
    }
}
