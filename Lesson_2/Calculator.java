public class Calculator {
    double calculate(int a, int b, char sign) {
        double result = 0;

        switch (sign) {
            case ('+'):
                result = a + b;
                break;
            case ('-'):
                result = a - b;
                break;
            case ('*'):
                result = a * b;
                break;
            case ('/'):
                if (b == 0) {
                    System.out.println("Error: cannot divide by zero");
                    return 0;
                }
                result = a / b;
                break;
            case ('^'):
                result = power(a, b);
                break;
            case ('%'):
                if (b == 0) {
                    System.out.println("Error: cannot divide by zero");
                    return 0;
                }
                result = a % b;
                break;
            default:
                System.out.println("Error: unknown sign " + sign);
                break;
        }
        return result;
    }

    double power(int num, int pow) {
        double result = 1;
        if (pow > 0) {
            for (int i = 1; i <= pow; i++) {
                result *= num;
            }
        } else {
            for (int i = -1; i >= pow; i--) {
                result /= num;
            }
        }
        return result;
    }
}
