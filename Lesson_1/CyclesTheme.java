public class CyclesTheme {
    public static void main(String[] args) {
        calculateSumOfEvenAndOddNumbers();
        showNumbersInDescOrder();
        showFiguresInRevOrderWithSum();
        printNumbersInMultLines();
        checkNumOfTwosForEvenOrOdd();
        printThreeShapes();
        printPartOfASCIITable();
        checkNumberForPalindrome();
        checkNumberForLucky();
        printPythagoreanMultTable();
    }

    static void calculateSumOfEvenAndOddNumbers() {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");

        byte counter = -10;
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;

        do {
            if (counter % 2 == 0) {
                sumOfEvenNumbers += counter;
            } else {
                sumOfOddNumbers += counter;
            }
            counter++;
        } while (counter <= 21);

        System.out.printf("In the interval [-10, 21] the sum of the even numbers is %d and the " +
                "sum of odd numbers is %d\n\n",
                sumOfEvenNumbers, sumOfOddNumbers);
    }

    static void showNumbersInDescOrder() {
        System.out.println("2. Вывод чисел в интервале (min и max) в порядке убывания");

        int number1 = 10;
        int number2 = 5;
        int number3 = -1;

        int min = number1;
        int max = number1;

        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }

        System.out.printf("the original numbers %d %d %d \n", number1, number2, number3);

        for (int i = max - 1; i > min; i--) {
            System.out.printf("%d ", i);
        }
    }

    static void showFiguresInRevOrderWithSum() {
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");

        int srcNumber = 1234;
        int sumOfDigits = 0;
        int copySrcNumber = srcNumber;
        int digit = copySrcNumber % 10;

        System.out.printf("an original number %d\nthe reversed number ", srcNumber);

        while (copySrcNumber >= 1) {
            System.out.print(digit);
            sumOfDigits += digit;
            copySrcNumber /= 10;
            digit = copySrcNumber % 10;
        }

        System.out.printf("\nthe sum of its figures %d\n\n", sumOfDigits);
    }

    static void printNumbersInMultLines() {
        System.out.println("4. Вывод чисел на консоль в несколько строк");

        int max = 24;
        int numbersInLine = 5;
        int counter = 1;

        for (int i = 1; i <= max / (2 * numbersInLine); i++) {
            for (int j = 0; j < 5; j++) {
                if (counter >= max) {
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
        int srcNumber = 3_242_592;
        int amountOfTwos = 0;
        int copySrcNumber = srcNumber;
        ;

        while (copySrcNumber >= 1) {
            if (copySrcNumber % 10 == 2) {
                amountOfTwos++;
            }
            copySrcNumber /= 10;
        }

        System.out.printf("The number %d contains %d - " + (amountOfTwos % 2 == 0 ? "even" :
                "odd") + " amount\n\n", srcNumber, amountOfTwos);
    }

    static void printThreeShapes() {
        System.out.println("6. Отображение фигур в консоли");
        int rectangleHorSide = 10;
        int rectangleVerSide = 5;
        int rightTriangleLeg = 5;
        int triangleBase = 5;
        int triangleHeight = (triangleBase + 1) / 2;

        for (int i = 0; i < rectangleVerSide; i++) {
            for (int j = 0; j < rectangleHorSide; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        int height = rightTriangleLeg;
        int length = 0;
        while (height > 0) {
            while (length < height) {
                System.out.print('#');
                length++;
            }
            System.out.println();
            height--;
            length = 0;
        }
        System.out.println();

        height = 1;
        int lineSize;
        do {
            if (height <= triangleHeight) {
                lineSize = height;
            } else {
                lineSize = triangleHeight - (height - (triangleBase + 1) / 2);
            }
            length = 1;
            do {
                System.out.print('$');
                length++;
            } while (length <= lineSize);
            System.out.println();
            height++;
        } while (height <= triangleBase);
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

    static void checkNumberForPalindrome() {
        System.out.println("\n8. Проверка, является ли число палиндромом");

        int srcNumber = 1_234_321;
        int reverseNumber = 0;

        int reverseBase = 1_000_000;

        int copySrcNumber = srcNumber;
        while (copySrcNumber >= 1) {
            reverseNumber += (copySrcNumber % 10) * reverseBase;
            copySrcNumber /= 10;
            reverseBase /= 10;
        }

        if (srcNumber == reverseNumber) {
            System.out.printf("The figure %d is palindrome and is equal to its reverse form - " +
                    "%d\n", srcNumber, reverseNumber);
        } else {
            System.out.printf("The figure %d is not palindrome and is not equal to its reverse " +
                    "form - %d\n", srcNumber, reverseNumber);
        }
    }

    static void checkNumberForLucky() {
        System.out.println("\n9. Определение, является ли число счастливым");

        int srcNumber = 662_626;
        int sumLeft = 0;
        int sumRight = 0;
        String left = "";
        String right = "";
        int digit;
        int copySrcNumber = srcNumber;
        int counter = 0;

        while (copySrcNumber >= 1) {
            digit = copySrcNumber  % 10;
            if (counter < 3) {
                sumLeft += digit;
                left += digit;
            } else {
                sumRight += digit;
                right += digit;
            }
            counter++;
            copySrcNumber /= 10;
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
