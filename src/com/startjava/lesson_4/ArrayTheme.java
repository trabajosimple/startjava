package com.startjava.lesson_4;

import java.util.Arrays;
import java.util.Random;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.print("1. Реверс значений массива\nThe origin array values ");
        int[] intArr = {7, 2, 3, 5, 6, 1, 4};
        printArr(intArr);
        for (int i = 0; i < intArr.length / 2; i++) {
            intArr[intArr.length - 1 - i] = intArr[i];
        }
        System.out.print("The reversed array values ");
        printArr(intArr);
        //
        System.out.println("\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i;
        }
        int productDigits = 1;
        for (int i = 0; i < 10; i++) {
            productDigits *= (i != 0 && i != 9) ? i : 1;
            System.out.printf((i != 0 && i != 9) ? "intArr[%d]=%d " : "\n0 or 9 intArr[%d]=%d\n", i,
                    intArr[i]);
        }
        System.out.println("\nResult of 1 * … * 8 = " + productDigits);
        //
        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        for (int i = 0; i < doubleArr.length; i++) {
            Random rand = new Random();
            doubleArr[i] = rand.nextDouble();
        }
        System.out.println("The origin array values :");
        printArrInLines(doubleArr, 8);
        double middleCellValue = doubleArr[doubleArr.length / 2];
        int countOfZeroValues = 0;
        for (int i = 0; i < doubleArr.length; i++) {
            if (doubleArr[i] > middleCellValue) {
                doubleArr[i] = 0;
                countOfZeroValues++;
            }
        }
        System.out.println("The converted array values :");
        printArrInLines(doubleArr, 8);
        System.out.println("The amount of zero values " + countOfZeroValues);
        //
        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] charArr = new char[26];
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = (char) ('A' + i);
        }
        for (int i = charArr.length - 1; i >= 0; i--) {
            for (int j = charArr.length - 1; j >= i; j--) {
                System.out.print(charArr[j]);
            }
            System.out.println();
        }
        //
        System.out.println("\n5. Генерация уникальных чисел");
        intArr = new int[30];
        Random rand = new Random();
        for (int i = 0; i < intArr.length; i++) {
            boolean isDuplicate = true;
            while (isDuplicate) {
                int randomNum = rand.nextInt(40) + 60;
                isDuplicate = false;
                for (int j = 0; j < i; j++) {
                    if (intArr[j] == randomNum) {
                        isDuplicate = true;
                    }
                }
                if (!isDuplicate) {
                    intArr[i] = randomNum;
                }
            }
        }
        Arrays.sort(intArr);
        printArrInLines(intArr, 10);
        //
        System.out.println("\n6. Копирование не пустых строк");
        String strArr[] = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        System.out.println("The origin array values");
        printArr(strArr);
        int countOfNonBlankValues = 0;
        for (String s : strArr) {
            if (!s.isBlank()) countOfNonBlankValues++;
        }
        String[] strShortcutArr = new String[countOfNonBlankValues];
        int startSrcIndex = 0;
        int startDistIndex = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].isBlank()) {
                if ((i - startSrcIndex) > 0) {
                    System.arraycopy(strArr, startSrcIndex, strShortcutArr, startDistIndex, i - startSrcIndex);
                    startDistIndex += i - startSrcIndex;
                }
                startSrcIndex = i + 1;
            }
        }
        System.out.println("The shortcut array values");
        printArr(strShortcutArr);
    }

    public static void printArr(int[] intArr) {
        for (int i : intArr) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void printArr(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            System.out.print((i == 0 ? "{\"" : "\"") + strArr[i] + (i == (strArr.length - 1) ?
                    "\"}" : "\","));
        }
        System.out.println();
    }

    public static void printArrInLines(double[] doubleArr, int lineSize) {
        int i = 0;
        while (i < doubleArr.length) {
            int indexOfNewLine = i;
            for (; i < indexOfNewLine + lineSize && i < doubleArr.length; i++) {
                System.out.printf("%.3f ", doubleArr[i]);
            }
            System.out.println();
        }
    }

    public static void printArrInLines(int[] intArr, int lineSize) {
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