public class Wolf {
    private char gender;
    private String name;
    private int weight;
    private int age;
    private String color;

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Incorrect age");
            return;
        }
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void walk() {
        System.out.println("is walking");
    }

    void sit() {
        System.out.println("is sitting");
    }

    void run() {
        System.out.println("is running");
    }

    void howl() {
        System.out.println("is howling");
    }

    void hunt() {
        System.out.println("is hunting");
    }
}
