public class Player {
    private String name;
    private int number;

    public Player(String playerName) {
        this.name = playerName;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
