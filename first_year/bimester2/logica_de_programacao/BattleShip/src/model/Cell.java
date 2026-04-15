package model;

public class Cell {
    public int state;

    public Cell() {
        this.state = 0;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String toString() {
        return switch (state) {
            case 0 -> "~";
            case 1 -> "X";
            case 2 -> "S";
            case 3 -> "O";
            default -> "?";
        };
    }
}
