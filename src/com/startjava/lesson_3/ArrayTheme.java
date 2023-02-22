package com.startjava.lesson_3;

import java.util.Arrays;
import java.util.Random;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.print("1. Реверс значений массива\nThe origin array values ");
        int[] intArr = {7, 2, 3, 5, 6, 1, 4};
        printIntArr(intArr);
        int[] intReversedArr = new int[intArr.length];
        for (int i = 0; i < intArr.length; i++) {
            intReversedArr[intArr.length - 1 - i] = intArr[i];
        }
        System.out.print("The reversed array values ");
        printIntArr(intReversedArr);

        System.out.println("\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            intArr[i] = rand.nextInt(10);
        }
        int resultOfMultiplying = 1;
        for (int i = 0; i < 10; i++) {
            resultOfMultiplying *= (i != 0 && i != 9) ? i : 1;
            System.out.printf((i != 0 && i != 9) ? "intArr[%d]=%d " : "\n0 or 9 intArr[%d]=%d\n", i,
                    intArr[i]);
        }
        System.out.println("\nResult of 1 * … * 8 = " + resultOfMultiplying);

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        for (int i = 0; i < doubleArr.length; i++) {
            Random rand = new Random();
            doubleArr[i] = rand.nextDouble();
        }
        System.out.println("The origin array values :");
        printDoubleArrInLines(doubleArr, 8);
        double valueOfMiddleElement = doubleArr[doubleArr.length / 2];
        int countOfZeroValues = 0;
        for (int i = 0; i < doubleArr.length; i++) {
            if (doubleArr[i] > valueOfMiddleElement) {
                doubleArr[i] = 0;
                countOfZeroValues++;
            }
        }
        System.out.println("The converted array values :");
        printDoubleArrInLines(doubleArr, 8);
        System.out.println("The amount of zero values " + countOfZeroValues);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] charArr = new char[26];
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = (char) (65 + i);
        }
        for (int i = charArr.length - 1; i >= 0; i--) {
            int lineSize = 1;
            for (int j = charArr.length - 1; j >= i; j--) {
                System.out.print(charArr[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        intArr = new int[30];
        for (int i = 0; i < intArr.length; i++) {
            Random rand = new Random();
            boolean ifDuplicate = true;
            while (ifDuplicate) {
                int newValue = rand.nextInt(40) + 60;
                ifDuplicate = false;
                for (int j = 0; j < i; j++) {
                    if (intArr[j] == newValue) {
                        ifDuplicate = true;
                    }
                }
                if (!ifDuplicate) {
                    intArr[i] = newValue;
                }
            }
        }
        Arrays.sort(intArr);
        printIntArrInLines(intArr, 10);
    }

    public static void printIntArr(int[] intArr) {
        for (int i : intArr) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void printDoubleArrInLines(double[] doubleArr, int lineSize) {
        int i = 0;
        while (i < doubleArr.length) {
            int indexOfNewLine = i;
            for (; i < indexOfNewLine + lineSize && i < doubleArr.length; i++) {
                System.out.printf("%.3f ", doubleArr[i]);
            }
            System.out.println();
        }
    }

    public static void printIntArrInLines(int[] intArr, int lineSize) {
        int i = 0;
        while (i < intArr.length) {
            int indexOfNewLine = i;
            for (; i < indexOfNewLine + lineSize && i < intArr.length; i++) {
                System.out.printf("%d ", intArr[i]);
            }
            System.out.println();
        }
    }
}