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

    private void chooseNumber() {
        Random rand = new Random();
        guessedNum = rand.nextInt(100) + 1;
    }

    private boolean checkNumber(Player player) {
        if (player.getEnteredNumber() != this.guessedNum) {
            System.out.printf("Player %s failed to guess the number!\n", player.getPlayerName());
            if (player.getEnteredNumber() > this.guessedNum) {
                System.out.println("It is more than what the comp guessed");
            } else if (player.getEnteredNumber() < this.guessedNum) {
                System.out.println("Is is less than what the comp guessed");
            }
            return false;
        }
        System.out.printf("Player %s guessed the number!\n", player.getPlayerName());
        return true;
    }

    private void enterNumber(Player player, Scanner keyboardInput) {
        System.out.printf("it's the %s's turn to guess the number: ", player.getPlayerName());
        player.setEnteredNumber(Integer.parseInt(keyboardInput.nextLine()));
    }

    public void play(Scanner keyboardInput) {
        boolean ifWin;
        chooseNumber();
        do {
            enterNumber(player1, keyboardInput);
            ifWin = checkNumber(player1);
            if (ifWin) break;
            enterNumber(player2, keyboardInput);
            ifWin = checkNumber(player2);
        } while (!ifWin);
    }
}
