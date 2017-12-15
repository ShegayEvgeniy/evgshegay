package ru.job4j.array;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 * Created by Evgeniy on 03.12.2017.
 */
public class ArrayStateTest {

    @Test
    public void testMassiveState() {
        int[] array = {1, 2, 3, 4, 5};
        ArrayState state = new ArrayState();
        boolean expect = true;
       //boolean a = true;
        boolean result = state.inSorted(array);
        assertThat(result, is(expect));
    }
}
