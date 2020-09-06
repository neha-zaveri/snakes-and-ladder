package domain;

public class Player {
    private int currentPosition;
    private Dice dice;

    public Player() {
        currentPosition = 0;
        dice = new Dice();
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public void rollDice() {
        int number = dice.getNumber();
        setCurrentPosition(getCurrentPosition() + number);
    }
}
