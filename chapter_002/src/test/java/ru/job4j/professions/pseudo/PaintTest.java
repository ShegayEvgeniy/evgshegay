package ru.job4j.professions.pseudo;


import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.After;
import org.junit.Before;


public class PaintTest {
    //поле содержит дефолтный вывод в консоль
    private final PrintStream stdout = System.out;
    //буфер для результата
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(this.out));
    }
    @After
    public void backOutput() {
        System.setOut(this.stdout);
    }



    @Test
    public void whenDrawSquare() {
        String ln = System.lineSeparator();
        this.loadOutput();
        new Paint().draw(new Square());
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
        .append("+ + + + +")
        .append(ln)
        .append("+       +")
        .append(ln)
        .append("+       +")
        .append(ln)
        .append("+       +")
        .append(ln)
        .append("+ + + + +")
        .append(ln)
        .toString()

        )
        );
       this.backOutput();
    }

    @Test
    public void whenDrawTriangle() {
        String ln = System.lineSeparator();
        this.loadOutput();
        new Paint().draw(new Triangle());
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
        .append("  +  ")
        .append(ln)
        .append(" + + ")
        .append(ln)
        .append("+++++")
        .append(ln)
        .toString()

        )
        );
       this.backOutput();
    }
}