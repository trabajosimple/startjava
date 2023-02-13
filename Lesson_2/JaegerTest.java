public class JaegerTest {

    public static void main(String[] args) {
        Jaeger robot1 = new Jaeger("Striker Eureka", "Mark-5", "Australia",
                76.2F, 1.850F, 10, 9);
        System.out.println("Robot1 - " + robot1.toString());

        Jaeger robot2 = new Jaeger();
        robot2.setModelName("Crimson Typhoon");
        robot2.setMark("Mark-4");
        robot2.setOrigin("China");
        robot2.setHeight(76.2F);
        robot2.setWeight(1.722F);
        robot2.setStrength(8);
        robot2.setArmor(6);
        System.out.println("Robot2 - " + robot2.toString());

        robot1.setOrigin(robot2.getOrigin());
        System.out.println("Robot1 - " + robot1.toString());
        robot1.drift();
        robot2.move();
    }
}
