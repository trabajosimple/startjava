import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Player player1 = enterPlayerName(console, "first");
        Player player2 = enterPlayerName(console, "second");
        GuessNumber game = new GuessNumber(player1, player2);
        String response;
        do {
            game.play(console);
            do {
                System.out.print("Do you want to continue? [yes/no]: ");
                response = console.nextLine();
            } while (!response.equals("yes") && !response.equals("no"));
        } while (response.equals("yes"));
    }

    private static Player enterPlayerName(Scanner console, String position) {
        String name;
        do {
            System.out.printf("Enter %s player name: ", position);
            name = console.nextLine();
        } while (name.isBlank());
        return new Player(name);
    }
}
