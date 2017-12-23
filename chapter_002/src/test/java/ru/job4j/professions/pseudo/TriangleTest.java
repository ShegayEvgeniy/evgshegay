package ru.job4j.professions.pseudo;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void whenShapeIsTriangle() {
        String ln = System.lineSeparator();
        Triangle triangle = new Triangle();
        assertThat(triangle.draw(), is(new StringBuilder()
        .append("  +  ")
        .append(ln)
        .append(" + + ")
        .append(ln)
        .append("+++++")
        .toString()
        )
        );

    }

}