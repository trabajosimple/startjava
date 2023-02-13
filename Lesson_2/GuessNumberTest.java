import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String response;
        do {
            System.out.print("Enter first player name: ");
            response = console.nextLine();
        } while (response.isBlank());
        Player player1 = new Player(response);

        do {
            System.out.print("Enter second player name: ");
            response = console.nextLine();
        } while (response.isBlank());
        Player player2 = new Player(response);

        do {
            GuessNumber game = new GuessNumber(player1, player2);
            game.play(console);
            do {
                System.out.print("Do you want to continue? [yes/no]: ");
                response = console.nextLine();
            } while (!response.equals("yes") && !response.equals("no"));
        } while (response.equals("yes"));
    }
}
