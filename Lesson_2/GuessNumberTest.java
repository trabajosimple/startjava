import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Player player1 = addPlayer(console, "first");
        Player player2 = addPlayer(console, "second");
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

    private static Player addPlayer(Scanner console, String number) {
        String name;
        do {
            System.out.printf("Enter %s player name: ", number);
            name = console.nextLine();
        } while (name.isBlank());
        return new Player(name);
    }
}
