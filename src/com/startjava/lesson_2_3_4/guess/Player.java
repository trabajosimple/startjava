package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    public static final int MAX_ATTEMPTS = 10;
    private String name;
    private int[] numbers;
    private int attempts;
    public Player(String name) {
        this.name = name;
        numbers = new int[MAX_ATTEMPTS];
    }
    public String getName() {
        return name;
    }
    public int getNumber() {
        return attempts == 0 ? 0 : numbers[attempts - 1];
    }
    public void addNumber(int number) {
        if (number <= 0 || number > 100) {
            throw new IllegalArgumentException("Incorrect number " + number + ", that is" +
                    (number <= 0 ? "less than or equal to zero" : "more than hundred"));
        }
        numbers[attempts++] = number;
    }
    public int[] getNumbers() {
        return Arrays.copyOfRange(numbers, 0, attempts);
    }
    public void clear() {
        Arrays.fill(numbers, 0, attempts, 0);
        attempts = 0;
    }
    public int getAttempts() {
        return attempts;
    }
}