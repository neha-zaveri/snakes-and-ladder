package domain;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlayerTest {
    @Test
    public void shouldMoveToNextPositionBasedOnDiceRoll() {
        Player player = new Player();
        int positionBeforeFirstRoll = player.getCurrentPosition();
        assertEquals(0, positionBeforeFirstRoll);
        player.rollDice();
        int positionAfterFirstRoll = player.getCurrentPosition();
        assertTrue(positionAfterFirstRoll != 0);
        assertTrue(positionAfterFirstRoll <= (6 + positionBeforeFirstRoll));
        player.rollDice();
        assertTrue(player.getCurrentPosition() <= (6 + positionAfterFirstRoll));
    }
}