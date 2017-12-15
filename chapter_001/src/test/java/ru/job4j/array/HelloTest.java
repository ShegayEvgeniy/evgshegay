
package ru.job4j.array;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Created by Evgeniy on 05.12.2017.
 */

public class HelloTest {

    @Test
    public void containsWordInWord() {
        Hello hello = new Hello();
        boolean expect = true;
        boolean result = hello.contains("зима", "м");
        assertThat(result, is(expect));
    }

}

