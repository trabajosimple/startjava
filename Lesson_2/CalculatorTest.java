import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println();
        String response;
        do {
            System.out.print("Enter the first number: ");
            int firstNumber = Integer.parseInt(keyboardInput.nextLine());
            System.out.print("Enter the sign of the math operation: ");
            char sign = keyboardInput.nextLine().charAt(0);
            System.out.print("Enter the second number: ");
            int secondNumber = Integer.parseInt(keyboardInput.nextLine());
            Calculator calc = new Calculator();
            System.out.println("Result: " + calc.calculate(firstNumber, secondNumber, sign));
            System.out.print("Do you want to continue? [yes/no]: ");
            response = keyboardInput.nextLine();
        } while (response.equals("yes"));
    }
}
