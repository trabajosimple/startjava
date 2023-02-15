import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int guessedNum;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play(Scanner console) {
        chooseRandomNumber();
        do {
            enterNumber(player1, console);
            if (isGuessed(player1)) break;
            enterNumber(player2, console);
        } while (!isGuessed(player2));
    }

    private void enterNumber(Player player, Scanner console) {
        System.out.printf("it's the %s's turn to guess the number: ", player.getName());
        player.setNumber(Integer.parseInt(console.nextLine()));
    }

    private void chooseRandomNumber() {
        Random rand = new Random();
        guessedNum = rand.nextInt(100) + 1;
    }

    private boolean isGuessed(Player player) {
        String comparisonResult;
        if (player.getNumber() == guessedNum) {
            System.out.printf("Player %s guessed the number!\n", player.getName());
            return true;
        } else if (player.getNumber() > guessedNum) {
            comparisonResult = "more";
        } else {
            comparisonResult = "less";
        }
        System.out.printf("Player %s failed to guess the number!\n", player.getName());
        System.out.printf("It is %s than what the comp guessed\n", comparisonResult);
        return false;
    }
}
