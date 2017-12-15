package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;



/**
 * Created by Evgeniy on 03.12.2017.
 */

public class ThreeMassiveTest {
    @Test
    public void twoMassivePlusOne() {

        int[]one = {1, 4, 5 };
        int[]two = {2, 4, 7};
        ThreeMassive three = new ThreeMassive();
        int[]expect = {1, 4, 5, 2, 4, 7};
        int[]result = three.summ(one, two);
        assertThat(result, is(expect));
    }

}
