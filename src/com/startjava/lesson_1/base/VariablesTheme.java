package com.startjava.lesson_1.base;

public class VariablesTheme {
    public static void main(String[] args) {
        displayPrimitiveDataTypes();
        calculateDiscountPrice();
        displayJava();
        displayMinMax();
        swapVariables();
        displayCharsAndCodes();
        displayASCIIArt();
        displayRanksOfNumber();
        displayTime();
    }

    static void displayPrimitiveDataTypes() {
        System.out.println("1. Вывод значений переменных на консоль");
        byte ramSizeInGB = 16;
        short cpuCores = 6;
        int cpuSpeedInKHertz = 27_000_000;
        long storageInKByte = 1_073_741_824L;
        float displaySize = 15.6F;
        double cpuTurboSpeedInGHertz = 4.7D;
        boolean touchScreen = true;
        char noteBookSize = 'M';
        System.out.printf("NoteBook characteristics: { ramSizeInGB: %s, cpuCores: %s, " +
                        "cpuSpeedInKHertz: %s, storageInKByte: %s, displaySize: %s, " +
                        "cpuTurboSpeedInGHertz: %s, touchScreen: %s, noteBookSize: %s} \n\n",
                ramSizeInGB, cpuCores, cpuSpeedInKHertz,
                storageInKByte, displaySize, cpuTurboSpeedInGHertz, touchScreen, noteBookSize);
    }

    static void calculateDiscountPrice() {
        System.out.println("2. Расчет стоимости товара со скидкой");
        float penPrice = 100F;
        float bookPrice = 200F;
        float discountPercent = 11 / 100F;
        float totalSum = (penPrice + bookPrice) * (1 - discountPercent);
        float discountPrice = (penPrice + bookPrice) * discountPercent;
        System.out.printf("Сумма скидки = %s,\nОбщая стоимость товаров со скидкой = %s\n\n",
                discountPrice,
                totalSum);
    }

    static void displayJava() {
        System.out.println("3. Вывод слова JAVA\n");
        System.out.println("   J    a  v     v  a\n" + "   J   a a  v   v  a a\n" + "J  J  aaaaa " +
                " V V  aaaaa\n" + " JJ  a     a  V  a     a\n");
    }

    static void displayMinMax() {
        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte byteNum = 127;
        short shortNum = 32_767;
        int intNum = 2_147_483_647;
        long longNum = 9_223_372_036_854_775_807L;
        System.out.printf("Byte original value %s, its incremented value %s, its decremented " +
                        "value %s\n",
                byteNum, ++byteNum, --byteNum);
        System.out.printf("Short original value %s, its incremented value %s, its decremented " +
                        "value %s\n",
                shortNum, ++shortNum, --shortNum);
        System.out.printf("Int original value %s, its incremented value %s, its decremented value" +
                        " %s\n",
                intNum, ++intNum, --intNum);
        System.out.printf("Long original value %s, its incremented value %s, its decremented" +
                        "value %s\n\n",
                longNum, ++longNum, --longNum);
    }

    static void swapVariables() {
        System.out.println("5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.println("C помощью третьей переменной");
        System.out.printf("Original values: %d, %d\n", num1, num2);
        int tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.printf("Rearranged values: %d, %d\n", num1, num2);
        System.out.println("с помощью арифметических операций");
        System.out.printf("Original values: %d, %d\n", num1, num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.printf("Rearranged values: %d, %d\n", num1, num2);
        System.out.println("с помощью побитовой операции ^");
        System.out.printf("Original values: %d, %d\n", num1, num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.printf("Rearranged values: %d, %d\n\n", num1, num2);
    }

    static void displayCharsAndCodes() {
        System.out.println("6. Вывод символов и их кодов");
        char char35 = '#';
        char char38 = '&';
        char char64 = '@';
        char char94 = '^';
        char char95 = '_';
        System.out.printf(" Char - Code\n");
        System.out.printf("   %s - %s\n", char35, (short) char35);
        System.out.printf("   %s - %s\n", char38, (short) char38);
        System.out.printf("   %s - %s\n", char64, (short) char64);
        System.out.printf("   %s - %s\n", char94, (short) char94);
        System.out.printf("   %s - %s\n\n", char95, (short) char95);
    }

    static void displayASCIIArt() {
        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char leftBracket = '(';
        char rightBracket = ')';
        char underline = '_';
        System.out.printf("    %s%s      \n", slash, backSlash);
        System.out.printf("   %s  %s    \n", slash, backSlash);
        System.out.printf("  %s%s%s %s%s      \n", slash, underline, leftBracket, rightBracket,
                backSlash);
        System.out.printf(" %s      %s   \n", slash, backSlash);
        System.out.printf("%s%s%s%s%s%s%s%s%s%s\n\n", slash, underline, underline, underline,
                underline, slash,
                backSlash, underline, underline, backSlash);
    }

    static void displayRanksOfNumber() {
        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int ones = num % 10;
        int tens = num / 10 % 10;
        int hundreds = num / 100;
        System.out.printf("Число %d содержит:\n" + "%d сотен\n" + "%d десятков\n" + "%d единиц\n " +
                        "Сумма его цифр =" + " %d\n" + "Произведение = %d\n\n", num, hundreds,
                tens, ones, hundreds + tens + ones, hundreds * ones * tens);
    }

    static void displayTime() {
        System.out.println("9. Вывод времени");
        int totalSeconds = 86399;
        short hours = (short) (totalSeconds / 3600);
        short minutes = (short) ((totalSeconds / 60) % 60);
        short seconds = (short) (totalSeconds % 60);
        System.out.printf("%s:%s:%s\n\n", hours, minutes, seconds);
    }
}
