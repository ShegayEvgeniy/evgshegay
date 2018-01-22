package ru.job4j.start;

//тест для класса шахматная  доска  с фигурой слон  для проверки программы шахматная доска

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BoardTest {
   @Test
    public void testTheBoard()  {
         Cell source = new Cell(0, 0);
         Cell dest = new Cell(7, 0);
         Figure elephant = new Elephant(source);
         Board board = new Board();
         try {
             board.fillFigures(0, 0, elephant);
         } catch (FigureNotFoundException f) {
             System.out.println("The figure is not found");
         }
         boolean two = board.move(source, dest, elephant);
         boolean one = true;
         assertThat(true, is(two));
   }

}