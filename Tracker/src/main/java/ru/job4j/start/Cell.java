package ru.job4j.start;

// Создает ячейку с координатами x -y

public class Cell {
    private int x;
    private int y;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int coordX() {
        return this.x;
    }

    public int coordY() {
        return this.y;
    }
}


