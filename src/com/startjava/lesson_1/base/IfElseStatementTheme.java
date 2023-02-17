package com.startjava.lesson_1.base;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        showPersonInfo();
        showMaxMin();
        verifyNumber();
        findIdenticalFiguresInTwoNumbers();
        findSymbolByCode();
        calculateAnnualTotalOfDeposit();
        showMarksOnSubjects();
        showAnnualIncome();
        calculateNumberOfBanknotes();
    }

    static void showPersonInfo() {
        System.out.println("1. Перевод псевдокода на язык Java");
        byte age = 25;
        boolean maleSex = false;
        float height = 1.75F;
        char capitalLetter = "Santa".charAt(0);

        if (age > 20) {
            System.out.println("Age is more than 20");
        } else {
            System.out.println("Age is less than 20");
        }

        if (!maleSex) {
            System.out.println("a woman");
        } else {
            System.out.println("a man");
        }

        if (height < 1.80) {
            System.out.println("short");
        } else {
            System.out.println("tall");
        }

        if (capitalLetter == 'M') {
            System.out.println("name starts with the letter M\n");
        } else if (capitalLetter == 'I') {
            System.out.println("name starts with the letter I\n");
        } else {
            System.out.println("name starts with the letter that is not equal to M or I\n");
        }
    }

    static void showMaxMin() {
        System.out.println("2. Поиск max и min числа");
        short num1 = 123;
        short num2 = 321;

        if (num1 == num2) {
            System.out.printf("%d == %d\n", num1, num2);
        } else if (num1 > num2) {
            System.out.printf("max %d min %d\n", num1, num2);
        } else {
            System.out.printf("min %d max %d\n", num1, num2);
        }
    }

    static void verifyNumber() {
        System.out.println("\n3. Проверка числа");

        int num = 222;
        System.out.println("number = " + num);

        if (num != 0) {
            if ((num % 2) == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
            if (num > 0) {
                System.out.println("positive");
            } else {
                System.out.println("negative");
            }
        } else {
            System.out.println("zero");
        }
    }

    static void findIdenticalFiguresInTwoNumbers() {
        System.out.println("\n4. Поиск одинаковых цифр в числах");

        int num1 = 879;
        int num2 = 879;
        boolean isDigitsEqual = false;
        int digitOfNum1 = num1 / 100 % 10;
        int digitOfNum2 = num2 / 100 % 10;

        System.out.printf("Numbers : %d, %d", num1, num2);

        if ((digitOfNum1 == digitOfNum2)) {
            System.out.printf("matching signs of hundreds : %d, %d", digitOfNum1, digitOfNum2);
            isDigitsEqual = true;
        }

        digitOfNum1 = num1 / 10 % 10;
        digitOfNum2 = num2 / 10 % 10;
        if ((digitOfNum1 == digitOfNum2)) {
            System.out.printf("matching signs of tens : %d, %d", digitOfNum1, digitOfNum2);
            isDigitsEqual = true;
        }

        digitOfNum1 = num1 % 10;
        digitOfNum2 = num2 % 10;
        if ((digitOfNum1 == digitOfNum2)) {
            System.out.printf("matching signs of ones : %d, %d", digitOfNum1, digitOfNum2);
            isDigitsEqual = true;
        }

        if (!isDigitsEqual) {
            System.out.printf("No matching digits found");
        }
    }

    static void findSymbolByCode() {
        System.out.println("\n5. Определение символа по его коду");

        char symbol = '\u0057';

        System.out.println("symbol =" + symbol);

        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("lower case letter\n");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("upper case letter\n");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println("number");
        } else {
            System.out.println("not a letter and not a number");
        }
    }

    static void calculateAnnualTotalOfDeposit() {
        System.out.println("6. Подсчет суммы вклада и начисленных банком %");

        float deposit = 300_000;
        float depositRate = 0.1F;
        float accruedIncome;

        if (deposit < 100_000) {
            depositRate = 0.05F;
        } else if (deposit < 300_000) {
            depositRate = 0.07F;
        }

        accruedIncome = deposit * depositRate;
        System.out.printf("For deposit %.2f accrued income is %.2f and at the end of the year the" +
                " total sum of the deposit is %.2f\n\n",
                deposit, accruedIncome, deposit + accruedIncome);
    }

    static void showMarksOnSubjects() {
        System.out.println("7. Определение оценки по предметам");

        int historyPercent = 59;
        int programmingPercent = 91;
        int historyMark = determineMark(historyPercent);
        int programmingMark = determineMark(programmingPercent);

        System.out.printf("History mark %d and in percent %d\n", historyMark, historyPercent);

        System.out.printf("Programming mark %d and in percent %d\n", programmingMark,
                programmingPercent);

        System.out.printf("Average mark %.1f and in percent %.1f\n\n",
                (float) ((historyMark + programmingMark) / 2),
                (float) ((historyPercent + programmingPercent) / 2));
    }

    static short determineMark(int markInPercent) {
        if (markInPercent <= 60) {
            return 2;
        } else if (markInPercent <= 73) {
            return 3;
        } else if (markInPercent <= 91) {
            return 4;
        } else {
            return 5;
        }
    }

    static void showAnnualIncome() {
        System.out.println("8. Расчет прибыли за год");
        int monthTurnover = 13_000;
        int rentCost = 5_000;
        int productionCost = 9_000;

        int annualIncome = (monthTurnover - rentCost - productionCost) * 12;

        if (annualIncome > 0) {
            System.out.println("Annual income : +" + annualIncome);
        } else {
            System.out.println("Annual income : " + annualIncome);
        }
    }

    static void calculateNumberOfBanknotes() {
        System.out.println("\n9. Подсчет количества банкнот");

        int withdrawalAmount = 567;

        int inATM100 = 10;
        int inATM10 = 5;
        int inATM1 = 50;

        int fromATM100 = withdrawalAmount / 100 % 10;
        int fromATM10 = withdrawalAmount / 10 % 10;
        int fromATM1 = withdrawalAmount % 10;

        if (fromATM100 > inATM100) {
            fromATM10 += (fromATM100 - inATM100) * 10;
            fromATM100 = inATM100;
        }

        if (fromATM10 > inATM10) {
            fromATM1 += (fromATM10 - inATM10) * 10;
            fromATM10 = inATM10;
        }

        if (fromATM1 > inATM1) {
            System.out.println("not enough banknotes in ATM\n\n");
        } else {
            System.out.printf("You will get hundredBanknotes = %d tenBanknotes = %d oneBanknotes " +
                    "= %d\n\n", fromATM100, fromATM10, fromATM1);
        }

        System.out.printf("Original sum = %d and recalculated sum = %d\n", withdrawalAmount,
                fromATM100 * 100 + fromATM10 * 10 + fromATM1);
    }
}