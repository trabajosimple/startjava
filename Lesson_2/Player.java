public class Player {

    private String playerName;
    private int enteredNumber;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getEnteredNumber() {
        return enteredNumber;
    }

    public void setEnteredNumber(int enteredNumber) {
        this.enteredNumber = enteredNumber;
    }
}
