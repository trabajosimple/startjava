package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    static final double SIGNIFICANT_FRACTION = 0.001D;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String response = "yes";
        do {
            System.out.print("\nEnter a math expression: ");
            double result;
            try {
                result = Calculator.calculate(console.nextLine());
            } catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println(e.fillInStackTrace() + " Enter a correct math expression.");
                continue;
            }
            printResult(result);
            do {
                System.out.print("Do you want to continue? [yes/no]: ");
                response = console.nextLine();
            } while (!response.equals("yes") && !response.equals("no"));
        } while (response.equals("yes"));
    }

    private static void printResult(double result){
        if (result % 1 > SIGNIFICANT_FRACTION) {
            System.out.printf("Result: %.3f\n", result);
        } else {
            System.out.printf("Result: %d\n", (long) result);
        }
    }
}
