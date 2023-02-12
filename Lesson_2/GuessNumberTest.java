import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter first player name: ");
        String playerName = keyboardInput.nextLine();
        if(playerName.isBlank()){
            System.out.println("Invalid name was entered");
        }
        Player player1 = new Player(playerName);
        System.out.print("Enter second player name: ");
        playerName = keyboardInput.nextLine();
        if(playerName.isBlank()){
            System.out.println("Invalid name was entered");
        }
        Player player2 = new Player(playerName);

        String response;
        do{
            GuessNumber guessNumber = new GuessNumber(player1, player2);
            guessNumber.play(keyboardInput);
            System.out.print("Do you want to continue? [yes/no]: ");
            response = keyboardInput.nextLine();
        } while (response.equals("yes"));
    }
}
