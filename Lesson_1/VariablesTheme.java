public class VariablesTheme {

    static void displayVariables() {
        byte ramSizeInGB = 16;
        short cpuCores = 6;
        int cpuSpeedInKHertz = 27_000_000;
        long storageInKByte = 1_073_741_824L;
        float displaySize = 15.6F;
        double cpuTurboSpeedInGHertz = 4.7D;
        boolean touchScreen = true;

        String template = "NoteBook characteristics: { ramSizeInGB: %s, cpuCores: %s, cpuSpeedInKHertz: %s, storageInKByte: %s, " +
                "displaySize: %s, " + "cpuTurboSpeedInGHertz: %s, touchScreen: %s} \n";

        System.out.println("1. Вывод значений переменных на консоль");
        System.out.printf(template, ramSizeInGB, cpuCores, cpuSpeedInKHertz, storageInKByte, displaySize, cpuTurboSpeedInGHertz, touchScreen);
    }

    static void calculatePrice() {
        float penPrice = 100F;
        float bookPrice = 200F;
        float discountPerCent = 11 / 100F;
        float totalSum = (penPrice + bookPrice) * (1 - discountPerCent);
        float discount = (penPrice + bookPrice) * (discountPerCent);

        System.out.println("2. Расчет стоимости товара со скидкой");
        System.out.printf("Сумма скидки = %s,\n Общая стоимость товаров со скидкой = %s\n", discount, totalSum);
    }

    static void displayJava() {
        System.out.println("3. Вывод слова JAVA\n");
        System.out.println("   J    a  v     v  a      \n" +
                "   J   a a  v   v  a a     \n" +
                "J  J  aaaaa  V V  aaaaa    \n" +
                " JJ  a     a  V  a     a\n");
    }

    static void displayMinMax() {
        byte byteNum = 127;
        short shortNum = 32_767;
        int intNum = 2_147_483_647;
        long longNum = 9_223_372_036_854_775_807L;

        System.out.println("4. Вывод min и max значений целых числовых типов");

        String template = "{ byte: %s, short: %s, int: %s, long: %s }";

        System.out.println("Original values: " + String.format(template, byteNum, shortNum, intNum, longNum));

        byteNum++;
        shortNum++;
        intNum++;
        longNum++;

        System.out.println("Incremented values: " + String.format(template, byteNum, shortNum, intNum, longNum));

        byteNum--;
        shortNum--;
        intNum--;
        longNum--;
        System.out.println("Decremented values: " + String.format(template, byteNum, shortNum, intNum, longNum));
    }

    static void rearrangeVariables() {
        int num1 = 2;
        int num2 = 5;

        System.out.println("5. Перестановка значений переменных");

        System.out.println("C помощью третьей переменной");

        System.out.printf("Original values: %d, %d\n", num1, num2);
        int tmp;
        tmp = num1;
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

        System.out.printf("Rearranged values: %d, %d\n", num1, num2);
    }

    static void displayChars() {
        System.out.println("6. Вывод символов и их кодов");

        char char35 = (char) 35;
        char char38 = (char) 38;
        char char64 = (char) 64;
        char char94 = (char) 94;
        char char95 = (char) 95;

        System.out.printf(" 35 %s, 38 %s, 64 %s, 94 %s, 95 %s", char35, char38, char64, char94, char95);

        char char23 = '\u0023';
        char char26 = '\u0026';
        char char40 = '\u0040';
        char char5e = '\u005e';
        char char5f = '\u005f';

        System.out.printf(" 35 %s, 38 %s, 64 %s, 94 %s, 95 %s", char23, char26, char40, char5e, char5f);
    }

    static void displayASCII() {
        System.out.println("7. Вывод в консоль ASCII-арт Дюка");

        char slash = '/';
        char doubleSlash = '\\';
        char leftBracket = '(';
        char rightBracket = ')';
        char underline = '_';

        System.out.printf("    %s%s      \n", slash, doubleSlash);
        System.out.printf("   %s  %s    \n", slash, doubleSlash);
        System.out.printf("  %s%s%s %s%s      \n", slash, underline, leftBracket, rightBracket, doubleSlash);
        System.out.printf(" %s      %s   \n", slash, doubleSlash);
        System.out.printf("%s%s%s%s%s%s%s%s%s%s\n", slash, underline, underline, underline, underline, slash, doubleSlash, underline, underline, doubleSlash);
    }

    static void displayRanksOfNumber() {
        System.out.println("8. Вывод количества сотен, десятков и единиц числа");

        short num = 123;
        short hundreds = (short) (num / 100);
        short tens = (short) (num / 10);
        short ones = (short) (num % 10);

        System.out.printf("Число %d содержит:\n" + "%d сотен\n" + "%d десятков\n" + "%d единиц\n"
                + "Сумма его цифр = %d\n" + "Произведение = %d\n", num, hundreds, tens, ones, hundreds + tens + ones, hundreds * ones * tens);
    }

    static void displayTime() {
        int num = 86399;
        short hours = (short) (num / 3600);
        short minutes = (short) ((num / 60) % 60);
        short seconds = (short) (num % 60);

        System.out.println("9. Вывод времени");

        System.out.printf("%s:%s:%s", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        displayVariables();
        calculatePrice();
        displayJava();
        displayMinMax();
        rearrangeVariables();
        displayChars();
        displayASCII();
        displayRanksOfNumber();
        displayTime();
    }
}
