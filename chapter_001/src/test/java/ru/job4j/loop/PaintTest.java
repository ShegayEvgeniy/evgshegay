package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;



public class PaintTest {

    @Test
    public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String result = paint.piramid(8);
        String expected = String.format(" ^ \r\n^^^\r\n", System.getProperty("line.separator"));
    }
}