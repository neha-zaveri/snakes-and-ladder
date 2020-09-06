package domain;

public class Board {
    private int size;
    private Player player;

    public Board() {
        this.size = 100;
        this.player = new Player();
    }

    public Player getPlayer() {
        return player;
    }

    public int getSize() {
        return size;
    }

}
