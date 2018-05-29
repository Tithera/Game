package se.tthera.game.model;

/**
* @author Therese
*
* A class that represents a position with two int, x and y.
*/

public class Position {

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position movePos(int deltaX, int deltaY) {
        return new Position(this.x + deltaX, this.y + deltaY);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Position{ x: " + x + ", y: " + y + " }";
    }

}
