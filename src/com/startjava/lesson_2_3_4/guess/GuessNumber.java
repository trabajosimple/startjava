package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int guessedNumber;
    private Player[] players;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void play(Scanner console) {
        clearPlayerNumbers();
        castLots();
        generateGuessedNumber();
        System.out.printf("Every player has %d attempts\n", Player.MAX_ATTEMPTS);
        boolean isGuessed = false;
        int roundNumber = 1;
        do {
            isGuessed = makeMove(console, roundNumber);
            roundNumber++;
        } while (!isGuessed && roundNumber <= Player.MAX_ATTEMPTS);
        if (isGuessed) {
            showNumbers();
        } else {
            System.out.printf(players[0].getName() + " has run out of attempts");
        }
    }

    private void clearPlayerNumbers() {
        for (Player player : players) {
            player.clear();
        }
    }
    public void castLots() {
        Random rand = new Random();
        for (int i = players.length - 1; i >= 0; i--) {
            int j = i == 0 ? 0 : rand.nextInt(i);
            Player player = players[i];
            players[i] = players[j];
            players[j] = player;
        }
    }

    private void generateGuessedNumber() {
        Random rand = new Random();
        guessedNumber = rand.nextInt(100) + 1;
    }

    private boolean makeMove(Scanner console, int roundNumber) {
        for (Player player : players) {
            System.out.printf("it's the %s's turn to guess the number: ", player.getName());
            enterNumber(player, console);
            if (isGuessed(player, roundNumber)) return true;
        }
        return false;
    }

    private void enterNumber(Player player, Scanner console) {
        do {
            try {
                player.addNumber(Integer.parseInt(console.nextLine()));
                break;
            } catch (IllegalArgumentException e) {
                System.out.print("Invalid number, enter once more: ");
            }
        } while (true);
    }

    private boolean isGuessed(Player player, int roundNumber) {
        String comparisonResult;
        if (player.getNumber() == guessedNumber) {
            System.out.printf("Player %s guessed the number %d on the %d try \n",
                    player.getName(), player.getNumber(), roundNumber);
            return true;
        }
        comparisonResult = player.getNumber() > guessedNumber ? "more" : "less";
        System.out.printf("Player %s failed to guess the number!\n", player.getName());
        System.out.printf("It is %s than what the comp guessed\n", comparisonResult);
        return false;
    }

    private void showNumbers() {
        int amount = 0;
        for (Player player : players) amount += player.getAttempts();
        int index = 0;
        for (Player player : players) {
            for (int number : player.getNumbers()) {
                System.out.printf("%2d ", number);
                if (index++ == (amount - 1) / 2) System.out.println();
            }
        }
        System.out.println();
    }
}
