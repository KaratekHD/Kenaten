package net.karatek.kenaten.objects;

public class Coordinate {

    private int inputx;
    private int inputy;

    public Coordinate(int x, int y) {
        inputx = x;
        inputy = y;
    }


    public int getX() {
        return inputx;
    }

    public int getY() {
        return inputy;
    }
}
