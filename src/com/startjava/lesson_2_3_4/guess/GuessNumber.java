package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int guessedNumber;
    private Player[] players;

    public GuessNumber(Player... players) {
        if (players.length < 2) {
            throw new IllegalArgumentException("Incorrect numbers of players");
        }
        this.players = players;
    }

    public void play(Scanner console) {
        clearPlayerNumbers();
        choosePlayOrder();
        chooseGuessedNumber();
        System.out.printf("Every player has %d attempts\n", Player.MAX_ATTEMPTS);
        boolean isGuessed = false;
        int roundNumber = 1;
        do {
            isGuessed = holdRound(console, roundNumber);
            roundNumber++;
        } while (!isGuessed && roundNumber <= Player.MAX_ATTEMPTS);
        if (isGuessed) {
            showNumbers();
        } else {
            System.out.printf(players[0].getName() + " has run out of attempts");
        }
    }

    public void choosePlayOrder() {
        Random rand = new Random();
        for (int i = players.length - 1; i >= 0; i--) {
            int j = i == 0 ? 0 : rand.nextInt(i);
            Player player = players[i];
            players[i] = players[j];
            players[j] = player;
        }
    }

    private void clearPlayerNumbers() {
        for (Player player : players) {
            player.clearNumbers();
        }
    }

    private void chooseGuessedNumber() {
        Random rand = new Random();
        guessedNumber = rand.nextInt(100) + 1;
    }

    private boolean holdRound(Scanner console, int roundNumber) {
        for (Player player : players) {
            System.out.printf("it's the %s's turn to guess the number: ", player.getName());
            player.setNumber(enterNumber(console));
            if (isGuessed(player, roundNumber)) return true;
        }
        return false;
    }

    private int enterNumber(Scanner console) {
        int number = 0;
        boolean isCorrect = false;
        do {
            try {
                number = Integer.parseInt(console.nextLine());
                isCorrect = true;
            } catch (IllegalArgumentException e) {
                System.out.print("Invalid number, enter once more: ");
                isCorrect = false;
            }
        } while (!isCorrect);
        return number;
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
        int[] numbers = Arrays.copyOf(players[0].getNumbers(),
                Player.MAX_ATTEMPTS * players.length);
        int index = players[0].getIndex();
        for (int i = 1; i < players.length; i++) {
            System.arraycopy(players[i].getNumbers(), 0, numbers, index, players[i].getIndex() + 1);
            index += players[i].getIndex();
        }
        Arrays.sort(numbers);
        for (int i = numbers.length - 1; i >= numbers.length - index; i--) {
            System.out.printf("%2d ", numbers[i]);
            if (i == index / 2) System.out.println();
        }
        System.out.println();
    }
}
