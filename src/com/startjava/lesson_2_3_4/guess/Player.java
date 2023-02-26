package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    public static final int MAX_ATTEMPTS = 10;
    private String name;
    private int[] numbers;
    private int index;

    public Player(String name) {
        this.name = name;
        numbers = new int[MAX_ATTEMPTS];
        index = 0;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return index == 0 ? 0 : numbers[index - 1];
    }

    public void setNumber(int number) {
        if (number <= 0 || number > 100) {
            throw new IllegalArgumentException("Incorrect number " + number + ", that is" +
                    (number <= 0 ? "less than or equal to zero" : "more than hundred"));
        }
        numbers[index++] = number;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, numbers.length);
    }

    public void clearNumbers() {
        Arrays.fill(numbers, 0);
        index = 0;
    }

    public int getIndex() {
        return index;
    }
}