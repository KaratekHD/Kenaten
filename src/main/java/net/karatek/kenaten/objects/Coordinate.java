package net.karatek.kenaten.objects;

public class Coordinate {

    // This is basically just a class for making pressing buttons and getting colors easy.

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
