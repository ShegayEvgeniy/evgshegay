package ru.job4j.loop;



public class Board {

    StringBuilder screen = new StringBuilder();
    String ln = System.lineSeparator();

    public String paint(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 1) {
                    screen.append(" ");
                } else {
                    screen.append("X");
                }
            }
            screen.append(ln);
        }

        return screen.toString();

    }

}
