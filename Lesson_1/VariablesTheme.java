import java.util.Arrays;

public class VariablesTheme {

    static void task_1() {
        byte ramSizeInGB = 16;
        short cpuCores = 6;
        int cpuSpeedInKHertz = 27_000_000;
        long storageInKByte = 1_073_741_824L;
        float displaySize = 15.6F;
        double cpuTurboSpeedInGHertz = 4.7D;
        boolean touchScreen = true;

        String template = "NoteBook characteristics: { ramSizeInGB: %s, cpuCores: %s, cpuSpeedInKHertz: %s, storageInKByte: %s, displaySize: %s, " +
                "cpuTurboSpeedInGHertz: %s, touchScreen: %s} ";

        System.out.println ("1. Вывод значений переменных на консоль");
        System.out.println (String.format (template, ramSizeInGB, cpuCores, cpuSpeedInKHertz, storageInKByte, displaySize, cpuTurboSpeedInGHertz, touchScreen));
    }

    static void task_2() {
        float penPrice = 100F;
        float bookPrice = 200F;
        float discountPerCent = 11 / 100F;
        float totalSum = (penPrice + bookPrice) * (1 - discountPerCent);
        float discount = (penPrice + bookPrice) * (discountPerCent);

        System.out.println ("2. Расчет стоимости товара со скидкой\n");
        System.out.println (String.format ("Сумма скидки = %s,\n Общая стоимость товаров со скидкой = %s", discount, totalSum));
    }

    static void task_3() {

        System.out.println ("3. Вывод слова JAVA\n");
        System.out.println ("   J    a  v     v  a      \n" +
                "   J   a a  v   v  a a     \n" +
                "J  J  aaaaa  V V  aaaaa    \n" +
                " JJ  a     a  V  a     a\n");

    }

    static void task_4() {
        byte byteNum = (byte) (Math.pow (2, 7) - 1);
        short shortNum = (short) (Math.pow (2, 15) - 1);
        int intNum = (int) (Math.pow (2, 31) - 1);
        long longNum = (long) (Math.pow (2, 63) - 1);

        System.out.println ("4. Вывод min и max значений целых числовых типов\n");

        String template = "{ byte: %s, short: %s, int: %s, long: %s }";

        System.out.println ("Original values: " + String.format (template, byteNum, shortNum, intNum, longNum));

        byteNum++;
        shortNum++;
        intNum++;
        longNum++;

        System.out.println ("Incremented values: " + String.format (template, byteNum, shortNum, intNum, longNum));

        byteNum--;
        shortNum--;
        intNum--;
        longNum--;
        System.out.println ("Decremented values: " + String.format (template, byteNum, shortNum, intNum, longNum));
    }

    static void task_5() {
        int num1 = 2;
        int num2 = 5;

        System.out.println ("5. Перестановка значений переменных\n");

        System.out.println ("C помощью третьей переменной\n");

        System.out.println (String.format ("Original values: %d, %d\n", num1, num2));
        int tmp;
        tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.println (String.format ("Rearranged values: %d, %d\n", num1, num2));

        System.out.println ("с помощью арифметических операций\n");

        System.out.println (String.format ("Original values: %d, %d\n", num1, num2));

        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;

        System.out.println (String.format ("Rearranged values: %d, %d\n", num1, num2));

        System.out.println ("с помощью побитовой операции ^\n");

        System.out.println (String.format ("Original values: %d, %d\n", num1, num2));

        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;

        System.out.println (String.format ("Rearranged values: %d, %d\n", num1, num2));

    }

    static void task_6() {
        System.out.println ("6. Вывод символов и их кодов\n");

        char[] symbols = {(char) 35, (char) 38, (char) 64, (char) 94, (char) 95};
        System.out.println (String.format (" 35 %s, 38 %s, 64 %s, 94 %s, 95 %s",
                symbols[0], symbols[1], symbols[2], symbols[3], symbols[4]));

        char[] symbolsInHex = {'\u0023', '\u0026', '\u0040', '\u005e', '\u005f' };
        System.out.println (String.format (" 35 %s, 38 %s, 64 %s, 94 %s, 95 %s",
                symbolsInHex[0], symbolsInHex[1], symbolsInHex[2], symbolsInHex[3], symbolsInHex[4]));


    }

    static void task_7() {
        System.out.println ("7. Вывод в консоль ASCII-арт Дюка\n");

        char[] symbol = {'/', '\\', '(', ')', '_' };

        System.out.println (String.format ("    %s%s      ", symbol[0], symbol[1]));
        System.out.println (String.format ("   %s  %s    ", symbol[0], symbol[1]));
        System.out.println (String.format ("  %s%s%s %s%s      ", symbol[0], symbol[4], symbol[2], symbol[3], symbol[1]));
        System.out.println (String.format (" %s      %s   ", symbol[0], symbol[1]));
        System.out.println (String.format ("%s%s%s%s%s%s%s%s%s%s", symbol[0], symbol[4], symbol[4], symbol[4], symbol[4],
                symbol[0], symbol[1], symbol[4], symbol[4], symbol[1]));

    }

    static void task_8() {
        System.out.println ("8. Вывод количества сотен, десятков и единиц числа\n");

        short num = 123;
        short hundreds = (short) (num / 100);
        short tens = (short) (num / 10);
        short ones = (short) (num % 10);

        System.out.println (String.format ("Число %d содержит:\n" +
                "%d сотен\n" +
                "%d десятков\n" +
                "%d единиц\n" +
                "Сумма его цифр = %d\n" +
                "Произведение = %d\n", num, hundreds, tens, ones, hundreds + tens + ones, hundreds * ones * tens));
    }

    static void task_9() {
        int num = 86399;
        short hours = (short) (num / 3600);
        short minutes = (short) ((num / 60) % 60);
        short seconds = (short) (num % 60);

        System.out.println ("9. Вывод времени\n");

        System.out.println (String.format ("%s:%s:%s", hours, minutes, seconds));
    };


        public static void main(String[] args){
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
