import domain.Board;

public class Game {
    public static void main(String[] args) {
        Board board = new Board();
        board.getPlayer().rollDice();
    }
}