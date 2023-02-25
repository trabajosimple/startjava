package com.startjava.lesson_4;

import java.util.Arrays;
import java.util.Random;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        System.out.println("The origin array values ");
        int[] intArr = {7, 2, 3, 5, 6, 1, 4};
        printArr(intArr);
        for (int i = 0; i < intArr.length / 2; i++) {
            intArr[intArr.length - 1 - i] ^= intArr[i];
            intArr[i] ^= intArr[intArr.length - 1 - i];
            intArr[intArr.length - 1 - i] ^= intArr[i];
        }
        System.out.print("The reversed array values ");
        printArr(intArr);

        System.out.println("\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i;
        }
        int productDigits = 1;
        for (int i = 0; i < intArr.length; i++) {
            productDigits *= (i != 0 && i != 9) ? i : 1;
            System.out.printf((i != 0 && i != 9) ? (i == 8) ? "%d = %d" : "%d * " : "\nindex %d" +
                    " value %d\n", i, (i == 8) ? productDigits : intArr[i]);
        }

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        for (int i = 0; i < doubleArr.length; i++) {
            Random rand = new Random();
            doubleArr[i] = rand.nextDouble();
        }
        System.out.println("The origin array values:");
        printArrInLines(doubleArr, 8);
        double middleCellValue = doubleArr[doubleArr.length / 2];
        int countOfZero = 0;
        for (int i = 0; i < doubleArr.length; i++) {
            if (doubleArr[i] > middleCellValue) {
                doubleArr[i] = 0;
                countOfZero++;
            }
        }
        System.out.println("The converted array values:");
        printArrInLines(doubleArr, 8);
        System.out.println("The amount of zero values " + countOfZero);

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

        System.out.println("\n6. Копирование не пустых строк");
        String[] srcStrings = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        System.out.println("The origin array values");
        printArr(srcStrings);
        int countOfNonBlank = 0;
        for (String s : srcStrings) {
            if (!s.isBlank()) countOfNonBlank++;
        }
        String[] destStrings = new String[countOfNonBlank];
        int startSrcIndex = 0;
        int startDistIndex = 0;
        for (int i = 0; i < srcStrings.length; i++) {
            if (srcStrings[i].isBlank()) {
                if ((i - startSrcIndex) > 0) {
                    System.arraycopy(srcStrings, startSrcIndex, destStrings, startDistIndex,
                           i - startSrcIndex);
                    startDistIndex += i - startSrcIndex;
                }
                startSrcIndex = i + 1;
            }
        }
        System.out.println("The shortcut array values");
        printArr(destStrings);
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