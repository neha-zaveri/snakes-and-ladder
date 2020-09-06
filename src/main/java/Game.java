import domain.Board;
import domain.Dice;
import domain.Player;
import domain.Snake;

import java.util.Optional;

public class Game {
    private Board board;
    private Player player;
    private Dice dice;

    public Game(Board board, Player player, Dice dice) {
        this.board = board;
        this.player = player;
        this.dice = dice;
    }

    public Board getBoard() {
        return board;
    }

    public Player getPlayer() {
        return player;
    }

    public  void play() {
        int stepsToMove = dice.roll();
        player.move(stepsToMove);
        Optional<Snake> snakeEncountered = board.getSnakes()
                .stream()
                .filter(snake -> snake.getStartPosition() == player.getCurrentPosition())
                .findFirst();
        snakeEncountered.ifPresent(snake -> player.setCurrentPosition(snake.getEndPosition()));
    }
}
