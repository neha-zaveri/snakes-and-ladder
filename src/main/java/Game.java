import domain.Board;
import domain.Player;
import domain.Snake;

import java.util.Optional;

public class Game {
    private Board board;
    private Player player;

    public Game() {
    }

    public Game(Board board, Player player) {
        this.board = board;
        this.player = player;
    }

    public Board getBoard() {
        return board;
    }

    public Player getPlayer() {
        return player;
    }

    public  void play() {
        player.rollDice();
        Optional<Snake> snakeEncountered = board.getSnakes()
                .stream()
                .filter(snake -> snake.getStartPosition() == player.getCurrentPosition())
                .findFirst();
        snakeEncountered.ifPresent(snake -> player.setCurrentPosition(snake.getEndPosition()));
    }
}
