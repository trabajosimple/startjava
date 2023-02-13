import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String response;
        do {
            System.out.print("\nEnter the first number: ");
            int number1 = Integer.parseInt(console.nextLine());
            System.out.print("Enter the sign of the math operation: ");
            char sign = console.nextLine().charAt(0);
            System.out.print("Enter the second number: ");
            int number2 = Integer.parseInt(console.nextLine());
            Calculator calc = new Calculator();
            System.out.println("Result: " + calc.calculate(number1, number2, sign));
            do {
                System.out.print("Do you want to continue? [yes/no]: ");
                response = console.nextLine();
            } while (!(response.equals("yes") || response.equals("no")));
        } while (response.equals("yes"));
    }
}
