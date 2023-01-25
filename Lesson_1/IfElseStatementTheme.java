public class IfElseStatementTheme {
    public static void main(String[] args) {
        showPersonInfo();
        showMaxMin();
        verifyNumber();
        findIdenticalFigures();
        findSymbolByCode();
        getAnnualTotalOfDeposit();
        showMarksOnSubjects();
        showAnnualIncome();
        showNumberOfBanknotes();
    }

    static void showPersonInfo() {
        byte age = 25;
        boolean maleSex = false;
        float height = 1.75F;
        String name = "Santa";
        char firstChar;

        System.out.println("1. Перевод псевдокода на язык Java");

        if (age > 20) {
            System.out.println("Age is more than 20");
        } else {
            System.out.println("Age is less than 20");
        }
        ;

        if (! maleSex) {
            System.out.println("a woman");
        } else {
            System.out.println("a man");
        }

        if (height < 1.80) {
            System.out.println("short");
        } else {
            System.out.println("tall");
        }

        firstChar = name.charAt(0);
        if (firstChar == 'M') {
            System.out.println("name starts with the letter M\n");
        } else if (firstChar == 'I') {
            System.out.println("name starts with the letter I\n");
        } else {
            System.out.println("name starts with the letter that is not equal to M or I\n");
        }
    }

    static void showMaxMin() {
        short num1 = 123;
        short num2 = 321;

        System.out.println("2. Поиск max и min числа");

        if (num1 > num2) {
            System.out.printf("max %d min %d\n", num1, num2);
        } else if (num1 == num2) {
            System.out.printf("%d == %d\n", num1, num2);
        } else {
            System.out.printf("min %d max %d\n", num1, num2);
        }

        System.out.println();
    }

    static void verifyNumber() {
        int num = 222;

        System.out.println("3. Проверка числа");

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
        System.out.println("");

    }

    static void findIdenticalFigures() {
        System.out.println("4. Поиск одинаковых цифр в числах");

        int num1 = 879;
        int num2 = 879;

        System.out.printf("Numbers : %d, %d", num1, num2);

        if ((num1 / 100 % 10 == num2 / 100 % 10)) {
            System.out.printf("matching signs of hundreds : %d, %d", num1 / 100 % 10, num2 / 100 % 10);
        }

        if ((num1 / 10 % 10 == num2 / 10 % 10)) {
            System.out.printf("matching signs of tens : %d, %d", num1 / 10 % 10, num2 / 10 % 10);
        }

        if ((num1 / 1 % 10 == num2 / 1 % 10)) {
            System.out.printf("matching signs of ones : %d, %d", num1 / 1 % 10, num2 / 1 % 10);
        }
        System.out.println();
    }

    static void findSymbolByCode() {
        System.out.println("5. Определение символа по его коду");

        char charSymbol = '\u0057';

        System.out.println("symbol =" + charSymbol);

        if (charSymbol > 'a' && charSymbol < 'z') {
            System.out.println("lower case letter\n");
        } else if (charSymbol > 'A' && charSymbol < 'Z') {
            System.out.println("upper case letter\n");
        } else if (charSymbol > '0' && charSymbol < '9') {
            System.out.println("number");
        } else {
            System.out.println("not a letter and not a number");
        }
    }

    static void getAnnualTotalOfDeposit() {
        System.out.println("6. Подсчет суммы вклада и начисленных банком %");

        float deposit = 300_000;
        float accruedIncome;

        if (deposit < 100_000) {
            accruedIncome = (float) (deposit * 0.05);
        } else if (deposit < 300_000) {
            accruedIncome = (float) (deposit * 0.07);
        } else {
            accruedIncome = (float) (deposit * 0.1);
        }

        System.out.printf("For deposit %.2f accrued income is %.2f and at the end of the year the total sum of the " +
                        "deposit is %.2f\n\n",
                deposit, accruedIncome, deposit + accruedIncome);
    }

    static short getMark(int markInPercent) {
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

    static void showMarksOnSubjects() {
        System.out.println("7. Определение оценки по предметам");

        int historyMarkInPercent = 59;
        int programmingMarkInPercent = 91;
        int historyMark = getMark(historyMarkInPercent);
        int programmingMark = getMark(programmingMarkInPercent);

        System.out.printf("History mark %d and in percent %d\n", historyMark, historyMarkInPercent);

        System.out.printf("Programming mark %d and in percent %d\n", programmingMark,
                programmingMarkInPercent);

        System.out.printf("Average mark %.1f and in percent %.1f\n\n",
                (float) ((historyMark + programmingMark) / 2),
                (float) ((historyMarkInPercent + programmingMarkInPercent) / 2));
    }

    static void showAnnualIncome() {
        System.out.println("8. Расчет прибыли за год");
        int monthTurnover = 13_000;
        int monthExpenses = 5_000 + 9_000;

        int annualIncome = (monthTurnover - monthExpenses) * 12;

        if (annualIncome > 0) {
            System.out.println("Annual income : +" + annualIncome);
        } else if (annualIncome == 0) {
            System.out.println("Annual income : zero");
        } else {
            System.out.println("Annual income : " + annualIncome);
        }
        System.out.println();
    }

    static void showNumberOfBanknotes() {
        System.out.println("9. Подсчет количества банкнот");

        int mountToBeWithdrawn = 567;

        int hundredBanknotesInAtm = 10;
        int tenBanknotesInAtm = 5;
        int oneBanknotesInAtm = 50;

        int hundredBanknotes = mountToBeWithdrawn / 100 % 10;
        int tenBanknotes = mountToBeWithdrawn / 10 % 10;
        int oneBanknotes = mountToBeWithdrawn / 1 % 10;

        if (hundredBanknotes > hundredBanknotesInAtm) {
            tenBanknotes += (hundredBanknotes - hundredBanknotesInAtm) * 10;
            hundredBanknotes = hundredBanknotesInAtm;
        }

        if (tenBanknotes > tenBanknotesInAtm) {
            oneBanknotes += (tenBanknotes - tenBanknotesInAtm) * 10;
            tenBanknotes = tenBanknotesInAtm;
        }

        System.out.printf("Original sum = %d and recalculated sum = %d\n", mountToBeWithdrawn,
                hundredBanknotes * 100 + tenBanknotes * 10 + oneBanknotes);

        if (oneBanknotes > oneBanknotesInAtm) {
            System.out.println("not enough banknotes in ATM\n\n");
        } else {
            System.out.printf("You will get hundredBanknotes = %d tenBanknotes = %d oneBanknotes = %d\n\n",
                    hundredBanknotes, tenBanknotes, oneBanknotes);
        }
    }
}
