package com.startjava.lesson_1.final_;
import java.util.Random;

public class MyFirstGame {
    public static void main(String[] args) {
        guessNumber(chooseNumber());
    }

    static int chooseNumber() {
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }

    static void guessNumber(int guessedNum) {
        int playerNum = 43;

        while (guessedNum != playerNum) {
            System.out.print("Fail to guess the number! ");
            if (guessedNum > playerNum) {
                System.out.println("It is more than what the comp guessed");
            } else {
                System.out.println("Is is less than what the comp guessed");
            }
            if (guessedNum == 100) {
                guessedNum = 1;
            } else {
                guessedNum++;
            }
        }
        System.out.println("You won!");
    }
} 
