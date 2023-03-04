package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String response = "no";
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
            System.out.print("Do you want to continue? [yes/no]: ");
            response = console.nextLine();
            if (response != "yes" || response != "no") {
                System.out.print("Do you want to continue? [yes/no]: ");
                response = console.nextLine();
            }
        } while (response.equals("yes"));
    }

    private static void printResult(double result) {
        System.out.printf("Result: " + (result % 1 != 0 ? "%.3f\n" : "%.0f\n"), result);
    }
}
