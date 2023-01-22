import java.util.Arrays;

public class CyclesTheme {

    //    подсчитайте с помощью do-while сумму четных и нечетных чисел в отрезке [-10, 21]
//    отобразите эти значения в формате:
//    в промежутке [-10, 21] сумма четных чисел = X, а нечетных = Y
    static void task_1() {
        System.out.println ("1. Подсчет суммы четных и нечетных чисел");

        byte num = -10;
        int evenSum = 0;
        int oddSum = 0;

        do {
            if (num % 2 == 0) {
                evenSum += num++;
            } else {
                oddSum += num++;
            }

        } while (num <= 21);

        System.out.println (String.format ("In the interval [-10, 21] the sum of the even numbers is %d and the sum of odd numbers is %d",
                evenSum, oddSum));
    }

    //    даны значения 10, 5, -1
//    найдите среди них max и min число
//    отобразите в консоль в одну строку, с помощью for, все числа в интервале (min, max) в порядке убывания
//    обратите внимание, что интервал — математический (не путайте его с отрезком)
//    использовать методы max и min класса Math — нельзя
    static void task_2() {
        System.out.println ("2. Вывод чисел в интервале (min и max) в порядке убывания");

        int[] num = {10, 5, -1};
        String result = "";

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    num[i] ^= num[j];
                    num[j] ^= num[i];
                    num[i] ^= num[j];
                }
            }
            if (result.isEmpty ()) {
                result += num[i];
            } else {
                result += ", " + num[i];
            }
        }
        ;
        result += ", " + num[num.length - 1];

        System.out.println (result);
    }

    //    дано число 1234
//    в цикле while выделите каждую его цифру
//    подсчитайте сумму полученных цифр
//    отобразите в консоли:
//    исходное число в обратном порядке (при этом формировать число целиком, чтобы вывести его, не нужно)
//    сумму его цифр
    static void task_3() {
        System.out.println ("3. Вывод реверсивного числа и суммы его цифр");

        int num = 1234;

        int[] figures = new int[4];
        int i = 0;

        while (i < 4) {
            figures[3 - i] = (int) (num / Math.pow (10, 3 - i) % 10);
            i++;
        }

        System.out.println (String.format ("original number %d, the number of reverse order of its figures %s, the sum of its figures %s",
                num,
                Arrays.toString (figures),
                Arrays.stream (figures).reduce (0, (subtotal, element) -> subtotal + element)));
    }

    //    выведите с помощью for на консоль числа в полуинтервале [1, 24)
//    шаг итерации 2
//    отображайте в каждой строке по 5 чисел
//    отделяйте их друг от друга необходимым количеством пробелов
//    не указывайте впереди числа нули
//    выравнивайте числа в каждом столбце по правому краю, используя форматированный (1, 2) вывод с помощью printf
//    недостающее в последней строке до 5 количество чисел заполните нулями
//    число нулей определяйте программно. Не считайте их в уме и не пишите сами
//    протестируйте дополнительно (для себя) правильность работы программы в полуинтервале [1, 31) без отправки в репозиторий
    static void task_4() {
        System.out.println ("4. Вывод чисел на консоль в несколько строк");

        int max = 24;
        int step = 2;
        int i = 1;
        int[] figures = new int[5];
        String format;

        while (i < max) {

            format = "";
            for (int j = 0; j < 5; j++) {

                if (i >= max) {
                    figures[j] = 0;
                } else {
                    figures[j] = i;
                }

                format += "%2d ";
                i += step;
            }

            format += "\n";
            System.out.printf (format, figures[0], figures[1], figures[2], figures[3], figures[4]);
        }
    }

    //    дано число 3242592
//    подсчитайте в цикле while количество 2, а затем проверьте получившееся значение на четность/нечетность
//    отобразите результат:
//    число X содержит N (четное/нечетное) количество двоек
    static void task_5() {
        System.out.println ("5. Проверка количества двоек на четность/нечетность");
        int num = 3_242_592;
        int rank = 6;
        int i = rank;
        int amount = 0;

        while (i >= 0) {

            if ((int) (num / Math.pow (10, i) % 10) == 2) {
                amount++;
            }
            i--;
        }

        if (amount % 2 == 0) {
            System.out.println (String.format ("The number %d contains %d - even amount of figure 2", num, amount));
        } else {
            System.out.println (String.format ("The number %d contains %d - odd amount of figure 2", num, amount));
        }
    }

    //    отобразите геометрические фигуры, используя:
//    для прямоугольника только for
//    для прямоугольного треугольника только while
//    для второго треугольника только do-while (для отображения данной фигуры достаточно двух циклов)
//    фигуры отображается друг под другом (не как в образце)
//**********    #####    $
//**********    ####     $$
//**********    ###      $$$
//**********    ##       $$
//**********    #        $
    static void task_6() {
        System.out.println ("6. Отображение фигур в консоли");
        int rectangleHorSide = 10;
        int rectangleVerSide = 5;
        int rightTriangleLeg = 5;
        int triangleBase = 5;
        int triangleHeight = (int) ((triangleBase + 1) / 2);

        String line;
        int i = 0, j = 0;

        for (i = 0; i < rectangleVerSide; i++) {
            line = "";
            for (j = 0; j < rectangleHorSide; j++) {
                line += '*';
            }
            System.out.println (line);
        }

        System.out.println ("");

        i = rightTriangleLeg;
        while (i > 0) {
            j = 0;
            line = "";
            while (j < i) {
                line += "#";
                j++;
            }
            System.out.println (line);
            i--;
        }

        System.out.println ("");

        i = 1;
        int lineSize = 0;
        do {
            if (i <= triangleHeight) {
                lineSize = i;
            } else {
                lineSize = triangleHeight - (i - (triangleBase + 1) / 2);
            }
            ;
            line = "";
            j = 1;

            do {
                line += "$";
                j++;
            } while (j <= lineSize);
            System.out.println (line);
            i++;
        } while (i <= triangleBase);

    }

    //    отобразите, используя for, данные столбцов Dec и Char (и названия столбцов) из таблицы
//    выведите на консоль:
//    символы, идущие до цифр и имеющие нечетные коды
//    маленькие английские буквы, имеющие четные коды
//    данные каждого столбца должны быть выровнены по правому краю
    static void task_7() {
        System.out.println ("7. Отображение ASCII-символов");
        char ch;

        for (int i = 0; i <= 122; i++) {

            if (i <= 47 && i % 2 != 0) {
                ch = (char) i;
                System.out.printf ("%3d %s \n", i, ch);
            } else if (i >= 97 && i % 2 == 0) {
                ch = (char) i;
                System.out.printf ("%3d %s \n", i, ch);
            }
        }
    }

    static int getFigureAccordingToRank(int rank, int num) {
        int base = 1;
        for (int j = 1; j <= rank; j++) {
            base *= 10;
        }
        return num / base % 10;
    }


    //    дано число 1234321
//    проверьте, является ли оно палиндромом (читается одинаково с любой стороны)
//    использовать Math.pow нельзя
//    отобразите в консоли:
//    число X является палиндромом
    static void task_8() {
        System.out.println ("8. Проверка, является ли число палиндромом");

        int num = 1234321;
        int rank = 6;
        int reverseNum = 0;
        int figure;

        int i = 0;
        int r = rank;
        int base;

        while (i <= rank) {

            figure = getFigureAccordingToRank (i, num);

            base = 1;
            for (int j = 1; j <= r; j++) {
                base *= 10;
            }
            i++;
            r--;
            reverseNum += figure * base;
        }

        if (num == reverseNum) {
            System.out.println (String.format ("The figure %d is palindrome and is equal to its reverse form - %d", num, reverseNum));
        } else {
            System.out.println (String.format ("The figure %d is not palindrome and is not equal to its reverse form - %d", num, reverseNum));
        }
    }

    //    счастливым называется число, сумма первых трех цифр которого равна сумме последних
//    возьмите любое шестизначное число
//    подсчитайте сумму каждой его половины
//    отобразите в консоли:
//    каждую тройку цифр в формате "Сумма цифр abc = sum"
//    является число счастливым или нет
    static void task_9() {
        System.out.println ("9. Определение, является ли число счастливым");

        int num = 662626;
        int sumLeft = 0, sumRight = 0, figure=0;
        String left, right;

        left = "";
        for (int i = 5; i >= 3; i--) {
            figure = getFigureAccordingToRank (i, num);
            sumLeft += figure;
            left += figure;
        }

        right = "";
        for (int i = 2; i >=0; i--) {
            figure = getFigureAccordingToRank (i, num);
            sumRight += figure;
            right += figure;
        }

        if(sumLeft == sumRight){
            System.out.println (String.format ("A lucky number, sum of the left figures is equal to the right %s = %s", left, right));
        } else {
            System.out.println (String.format ("Not a lucky number, sum of the left figures is not equal to the right %s != %s", left, right));
        }
    }

//    отобразите таблицу умножения в точности, как в образце, включая горизонтальные и вертикальные линии
//    не добавляйте между строками и столбцами лишние пустоты
//    используйте цикл for
    static void task_10() {
        System.out.println ("10. Вывод таблицы умножения Пифагора");

        int result=0;

        for(int i=1; i<10; i++){

            for (int j=1; j<10; j++){
                result = i*j;
                if(result > 1){
                    System.out.printf ("%2d ", result);
                } else{
                    System.out.printf ("   ");
                }
                if(j==1) {
                    System.out.printf (" | ");
                }
            }
            System.out.println ("");
            if (i==1) {
                System.out.println ("------------------------------");
            }
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
        task_10 ();
    }
}
