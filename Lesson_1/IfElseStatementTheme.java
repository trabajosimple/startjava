public class IfElseStatementTheme {

    static void task_1() {
        byte age = 25;
        boolean maleSex = false;
        float height = 1.75F;
        String name = "Santa";
        char firstChar;

        System.out.println ("1. Перевод псевдокода на язык Java");

        if (age > 20) {
            System.out.println ("Age is more than 20");
        } else {
            System.out.println ("Age is less than 20");
        }
        ;

        if (!maleSex) {
            System.out.println ("a woman");
        } else {
            System.out.println ("a man");
        }

        if (height < 1.80) {
            System.out.println ("short");
        } else {
            System.out.println ("tall");
        }

        firstChar = name.charAt (0);
        if (firstChar == 'M') {
            System.out.println ("name starts with the letter M");
        } else if (firstChar == 'I') {
            System.out.println ("name starts with the letter I");
        } else {
            System.out.println ("name starts with the letter that is not equal to M or I");
        }

    }

    static void task_2() {
        short num1 = 123;
        short num2 = 321;

        System.out.println ("2. Поиск max и min числа");

        if (num1 > num2) {
            System.out.println (String.format ("max %d min %d", num1, num2));
        } else if (num1 == num2) {
            System.out.println (String.format ("%d == %d", num1, num2));
        } else {
            System.out.println (String.format ("min %d max %d", num1, num2));
        }
    }

    static void task_3() {
        int num = 0;

        System.out.println ("3. Проверка числа");

        System.out.println ("number = " + num);

        if (num != 0) {
            if ((num % 2) == 0) {
                System.out.println ("even");
            } else {
                System.out.println ("odd");
            }
            if (num > 0) {
                System.out.println ("positive");
            } else {
                System.out.println ("negative");
            }
        } else {
            System.out.println ("zero");
        }
    }

    static void task_4() {
        System.out.println ("4. Поиск одинаковых цифр в числах");

        int num1 = 123;
        int num2 = 123;

        System.out.println (String.format ("Numbers : %d, %d", num1, num2));

        if ((num1 / 100 % 10 == num2 / 100 % 10)) {
            System.out.println (String.format ("matching signs of hundreds : %d, %d", num1 / 100 % 10, num2 / 100 % 10));
        }

        if ((num1 / 10 % 10 == num2 / 10 % 10)) {
            System.out.println (String.format ("matching signs of tens : %d, %d", num1 / 10 % 10, num2 / 10 % 10));
        }

        if ((num1 / 1 % 10 == num2 / 1 % 10)) {
            System.out.println (String.format ("matching signs of ones : %d, %d", num1 / 1 % 10, num2 / 1 % 10));
        }

    }

    static void task_5() {
        System.out.println ("5. Определение символа по его коду");

        char charSymbol = '\u0057';

        System.out.println ("symbol =" + charSymbol);

        if (charSymbol > 'a' && charSymbol < 'z') {
            System.out.println ("lower case letter\n");
        } else if (charSymbol > 'A' && charSymbol < 'Z') {
            System.out.println ("upper case letter\n");
        } else if (charSymbol > '0' && charSymbol < '9') {
            System.out.println ("number");
        } else {
            System.out.println ("not a letter and not a number");
        }

    }

    static void task_6() {
        System.out.println ("6. Подсчет суммы вклада и начисленных банком %\n");

        float deposit = 300_000;
        float accruedIncome;

        if (deposit < 100_000) {
            accruedIncome = (float) (deposit * 0.05);
        } else if (deposit < 300_000) {
            accruedIncome = (float) (deposit * 0.07);
        } else {
            accruedIncome = (float) (deposit * 0.1);
        }

        System.out.println (String.format ("For deposit %d accrued income is %d and total sum of the deposit is %d",
                (int) deposit, (int) accruedIncome, (int) (deposit + accruedIncome)));
    }

    static short getMark(short markInPercent) {
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

    static void task_7() {
        System.out.println ("7. Определение оценки по предметам\n");

        short historyMarkInPercent = 59;
        short programmingMarkInPercent = 91;
        short historyMark = getMark (historyMarkInPercent);
        short programmingMark = getMark (programmingMarkInPercent);

        System.out.println (String.format ("History mark %d and in percent %d", historyMark, historyMarkInPercent));

        System.out.println (String.format ("Programming mark %d and in percent %d", programmingMark, programmingMarkInPercent));

        System.out.println (String.format ("Average mark %f and in percent %f", (float) ((historyMark + programmingMark) / 2),
                (float) ((historyMarkInPercent + programmingMarkInPercent) / 2)));
    }

    static int getAnnualIncome(int monthTurnover, int monthExpenses) {
        return (monthTurnover - monthExpenses) * 12;
    }

    static void task_8() {
        System.out.println ("8. Расчет прибыли за год\n");

        int annualIncome = getAnnualIncome (13_000, 9_000 + 5_000);

        if (annualIncome > 0) {
            System.out.println ("Annual income : +" + annualIncome);
        } else if (annualIncome == 0) {
            System.out.println ("Annual income : zero");
        } else {
            System.out.println ("Annual income : " + annualIncome);
        }

    }

    static void task_9() {
        System.out.println ("9. Подсчет количества банкнот\n");

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

        System.out.println (String.format ("Original sum = %d and recalculated sum = %d", mountToBeWithdrawn,
                hundredBanknotes * 100 + tenBanknotes * 10 + oneBanknotes));

        if (oneBanknotes > oneBanknotesInAtm) {
            System.out.println ("not enough banknotes in ATM");
        } else {
            System.out.println (String.format ("You will get hundredBanknotes = %d tenBanknotes = %d oneBanknotes = %d",
                    hundredBanknotes, tenBanknotes, oneBanknotes));
        }


    }

    public static void main(String[] args) {
        task_1 ();
        task_2 ();
        task_3 ();
        task_4 ();
        task_5 ();
        task_6 ();
        task_7 ();
        task_8 ();
        task_9 ();
    }
}
