package com.startjava.lesson_2_3.guess;
import com.startjava.lesson_2_3.person.Player;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Player player1 = createPlayer(console, "first");
        Player player2 = createPlayer(console, "second");
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

    private static Player createPlayer(Scanner console, String position) {
        String name;
        do {
            System.out.printf("Enter %s player name: ", position);
            name = console.nextLine();
        } while (name.isBlank());
        return new Player(name);
    }
}
