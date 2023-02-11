public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = 'M';
        wolf.age = 10;
        wolf.color = "GREY";
        wolf.name = "JOHN";
        wolf.weight = 20;
        System.out.printf("A wolf with the following characteristics: gender %c age %d color %s " +
                "name %s weight %d\n", wolf.gender, wolf.age, wolf.color, wolf.name, wolf.weight);
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.walk();
        wolf.hunt();
    }
}
