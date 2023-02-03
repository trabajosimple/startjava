public class Calculator {
    public static void main(String[] args) {
        performMathOperation(100, 50, '-');
        performMathOperation(100, 50, '+');
        performMathOperation(100, 50, '*');
        performMathOperation(100, 50, '/');
        performMathOperation(100, 50, '%');
        performMathOperation(100, 5, '^');
    } 

    static void performMathOperation(int a, int b, char sign) {

        double result;

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            if (b == 0) {
                System.out.println("Error: cannot divide by zero");
                return;
            } else {
                result = a / b;
            }
        } else if (sign == '^') {
            result = putNumInPower(a, b);
        } else if (sign == '%') {
            if (b == 0) {
                System.out.println("Error: cannot divide by zero");
                return;
            } else {
                result = a % b;
            }
        } else {
            System.out.println("Error: unknown sign " + sign);
            return;
        }
        System.out.printf("The result of math operation %d %s %d = %.2f\n", a, sign, b, result);
    }

    static double putNumInPower(int num, int pow) {
        double result = num;

        if (pow == 0) {
            result = 1;
        } else if (pow > 0) {
            for (int i = 1; i < pow; i++) {
                result *= num;
            }
        } else {
            result = 1;
            for (int i = -1; i >= pow; i--) {
                result /= num;
            }
        }
        return result;
    }

}
