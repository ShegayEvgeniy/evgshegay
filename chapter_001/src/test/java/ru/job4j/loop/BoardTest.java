package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.loop.Board;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BoardTest {

    @Test
    public void when3x3() {
        Board board = new Board();
        String rsl = board.paint(3, 3);
        String ln = System.lineSeparator();
        assertThat(rsl, is(String.format("X X\r\n X \r\nX X\r\n", ln, ln, ln)));


    }

    @Test
    public void when5x4() {
        Board board = new Board();
        String rsl = board.paint(5, 4);
        String ln = System.lineSeparator();
        assertThat(rsl, is(String.format("X X X\r\n X X \r\nX X X\r\n X X \r\n", ln, ln, ln)));


    }
}
