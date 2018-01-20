package ru.job4j.start;

// класс создает ячейку с координатами фигуры . Напримере слона .

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


