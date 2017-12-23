package ru.job4j.professions.pseudo;

public class Paint {

    public void draw(Shape shape) {

        System.out.println(shape.draw());

    }

    public static void main(String[] args) {
          Shape shape = new Square();
          new Paint().draw(shape);
          System.out.println();
          System.out.println();
          Shape shape2 = new Triangle();
          new Paint().draw(shape2);
    }
}
