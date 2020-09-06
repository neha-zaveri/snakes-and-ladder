package domain;

import java.util.Random;

public class Dice {
    Random random = new Random();
    public int getNumber() {
        int diceNumber = random.nextInt(7);
        return diceNumber == 0 ? 1 : diceNumber;
    }
}
