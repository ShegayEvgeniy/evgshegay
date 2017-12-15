package ru.job4j.loop;

/**
 * Created by Evgeniy on 03.12.2017.
 */
public class Paint {

    StringBuilder screen = new StringBuilder();
    String separator = System.getProperty("line.separator");


    public String piramid(int h) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= h * 2; j++) {
                if (j > h - 2 - i && j < h + i) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.getProperty("line.separator"));
        }
        System.out.println(screen.toString());
        return screen.toString();

    }
}
