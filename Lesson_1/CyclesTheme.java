public class CyclesTheme {
    public static void main(String[] args) {
        calculateSumOfEvenAndOddNumbers();
        showNumbersInDescOrder();
        showFiguresInRevOrderWithSum();
        printNumbersInMultLines();
        checkNumOfTwosForEvenOrOdd();
        printThreeShapes();
        printPartOfASCIITable();
        checkNumForPalindrome();
        checkNumForLucky();
        printPythagoreanMultTable();
    }

    static void calculateSumOfEvenAndOddNumbers() {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");

        byte counter = -10;
        int sumOfEvenNum = 0;
        int sumOfOddNum = 0;

        do {
            if (counter % 2 == 0) {
                sumOfEvenNum += counter;
            } else {
                sumOfOddNum += counter;
            }
            counter++;
        } while (counter <= 21);

        System.out.printf("In the interval [-10, 21] the sum of the even numbers is %d and the " +
                        "sum of odd numbers is %d\n\n",
                sumOfEvenNum, sumOfOddNum);
    }

    static void showNumbersInDescOrder() {
        System.out.println("2. Вывод чисел в интервале (min и max) в порядке убывания");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;

        int minNum = num1;
        int maxNum = num1;

        if (num2<minNum) {
          minNum = num2;
        }
        if(num3<minNum){
            minNum = num3;
        }
        if(num2 > maxNum){
            maxNum = num2;
        }
        if(num3 > maxNum){
            maxNum = num3;
        }

        System.out.printf("the original numbers %d %d %d \n", num1, num2, num3);

        for (int i = minNum + 1; i < maxNum; i++) {
            System.out.printf("%d ", i);
        }
    }

    static void showFiguresInRevOrderWithSum() {
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");

        int srcNum = 1234;
        int sumOfDigits = 0;
        int remainder = srcNum;
        int digit = 0;

        System.out.printf("an original number %d\nthe reversed number ", srcNum);

        while (remainder >= 1) {
            digit = remainder % 10;
            System.out.printf("%d", digit);
            sumOfDigits += digit;
            remainder /= 10;
        }

        System.out.printf("\nthe sum of its figures %d\n\n", sumOfDigits);
    }

    static void printNumbersInMultLines() {
        System.out.println("4. Вывод чисел на консоль в несколько строк");

        int maxNum = 24;
        int numbersInLine = 5;
        int counter = 1;

        for (int i = 0; i < maxNum / (2*numbersInLine) + 1; i++) {
            for (int j = 0; j < 5; j++) {
                if(counter >= maxNum){
                    System.out.printf("%2d ", 0);
                } else {
                    System.out.printf("%2d ", counter);
                }
                counter += 2;
            }
            System.out.println();
        }
    }

    static void checkNumOfTwosForEvenOrOdd() {
        System.out.println("\n5. Проверка количества двоек на четность/нечетность");
        int num = 3_242_592;
        int amountOfTwos = 0;

        int base = 1;
        while (base <= 1_000_000) {
            if (num / base % 10 == 2) {
                ++amountOfTwos;
            }
            base *= 10;
        }

        if (amountOfTwos % 2 == 0) {
            System.out.printf("The number %d contains %d - even amount of figure 2\n\n", num,
                    amountOfTwos);
        } else {
            System.out.printf("The number %d contains %d - odd amount of figure 2\n\n", num,
                    amountOfTwos);
        }
    }

    static void printThreeShapes() {
        System.out.println("6. Отображение фигур в консоли");
        int rectangleHorSide = 10;
        int rectangleVerSide = 5;
        int rightTriangleLeg = 5;
        int triangleBase = 5;
        int triangleHeight = (triangleBase + 1) / 2;

        String line;
        int i;
        int j;

        for (i = 0; i < rectangleVerSide; i++) {
            line = "";
            for (j = 0; j < rectangleHorSide; j++) {
                line += '*';
            }
            System.out.println(line);
        }
        System.out.println();

        i = rightTriangleLeg;
        while (i > 0) {
            j = 0;
            line = "";
            while (j < i) {
                line += "#";
                j++;
            }
            System.out.println(line);
            i--;
        }
        System.out.println();

        i = 1;
        int lineSize = 0;
        do {
            if (i <= triangleHeight) {
                lineSize = i;
            } else {
                lineSize = triangleHeight - (i - (triangleBase + 1) / 2);
            }
            line = "";
            j = 1;

            do {
                line += "$";
                j++;
            } while (j <= lineSize);
            System.out.println(line);
            i++;
        } while (i <= triangleBase);
    }

    static void printPartOfASCIITable() {
        System.out.println("\n7. Отображение ASCII-символов");

        for (int i = 0; i <= 122; i++) {
            if (i <= 47 && i % 2 != 0) {
                System.out.printf("%3d %c \n", i, (char) i);
            } else if (i >= 97 && i % 2 == 0) {
                System.out.printf("%3d %c \n", i, (char) i);
            }
        }
    }

    static void checkNumForPalindrome() {
        System.out.println("\n8. Проверка, является ли число палиндромом");

        int srcNum = 1_234_321;
        int reverseNum = 0;

        int base = 1;
        int reverseBase = 1_000_000;

        while (base <= 1_000_000) {
            reverseNum += (srcNum / base % 10) * reverseBase;

            base *= 10;
            reverseBase /= 10;
        }

        if (srcNum == reverseNum) {
            System.out.printf("The figure %d is palindrome and is equal to its reverse form - " +
                    "%d\n", srcNum, reverseNum);
        } else {
            System.out.printf("The figure %d is not palindrome and is not equal to its reverse " +
                    "form - %d\n", srcNum, reverseNum);
        }
    }

    static void checkNumForLucky() {
        System.out.println("\n9. Определение, является ли число счастливым");

        int srcNum = 662_626;
        int sumLeft = 0;
        int sumRight = 0;
        String left = "";
        String right = "";
        int base = 1;
        int figure;

        for (int i = 0; i < 6; i++) {
            figure = srcNum / base % 10;
            if (i < 3) {
                sumLeft += figure;
                left += figure;
            } else {
                sumRight += figure;
                right += figure;
            }
            base *= 10;
        }

        if (sumLeft == sumRight) {
            System.out.printf("A lucky number, sum of the left figures is equal to the right ones" +
                            " %s = %s\n",
                    left, right);
        } else {
            System.out.printf("Not a lucky number, sum of the left figures is not equal to the " +
                    "right ones %s != %s\n", left, right);
        }
    }

    static void printPythagoreanMultTable() {
        System.out.println("\n10. Вывод таблицы умножения Пифагора");

        int result;

        for (int i = 1; i < 10; i++) {

            for (int j = 1; j < 10; j++) {
                result = i * j;
                if (result > 1) {
                    System.out.printf("%2d ", result);
                } else {
                    System.out.printf("   ");
                }
                if (j == 1) {
                    System.out.printf(" | ");
                }
            }
            System.out.println("");
            if (i == 1) {
                System.out.println("------------------------------");
            }
        }
    }
}
