package ru.job4j.start;

import static org.junit.Assert.*;
import org.junit.Test;
import ru.job4j.start.Board;
import ru.job4j.models.Item;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BoardTest {
   @Test
    public void testTheBoard()  {
         Cell source = new Cell(0, 0);
         Cell dest = new Cell(7, 7);
         Figure[][]figures = new Figure[8][8];
         Figure elephant = new Elephant(source);
         Board board = new Board(source, dest, figures, elephant);
         board.fillFigures(0, 0);
         boolean two = board.move(source, dest);
         boolean one = true;
         assertThat(true, is(two));
   }

}