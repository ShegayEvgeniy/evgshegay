package ru.job4j.start;

//тест для класса шахматная  доска  с фигурой слон

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BoardTest {
   @Test
    public void testTheBoard()  {
         Cell source = new Cell(0, 0);
         Cell dest = new Cell(7, 0);
         Figure[][]figures = new Figure[8][8];
         Figure elephant = new Elephant(source);
         Board board = new Board(source, dest, figures, elephant);
         try {
             board.fillFigures(0, 0);
         } catch (FigureNotFoundException f) {
             System.out.println("The figure is not found");
         }
         boolean two = board.move(source, dest);
         boolean one = true;
         assertThat(true, is(two));
   }

}