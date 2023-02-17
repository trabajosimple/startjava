package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender('M');
        wolf.setAge(5);
        wolf.setColor("GREY");
        wolf.setName("JOHN");
        wolf.setWeight(20);
        System.out.printf("A wolf with the following characteristics: gender %c age %d color %s " +
                "name %s weight %d\n", wolf.getGender(), wolf.getAge(), wolf.getColor(),
                wolf.getName(), wolf.getWeight());
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.walk();
        wolf.hunt();
    }
}
