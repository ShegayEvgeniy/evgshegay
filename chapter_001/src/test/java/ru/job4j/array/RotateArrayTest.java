package ru.job4j.array;

/**
 * Created by Evgeniy on 02.12.2017.
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RotateArrayTest {

    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        int[][] input = {{1, 2}, {3, 4}};
        int[][]expect = {{3, 1}, {4, 2}};
        RotateArray rotate =  new RotateArray();
        int[][]result = rotate.rotateMatrixRight(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        int[][]input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][]expect = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        RotateArray rotate =  new RotateArray();
        int[][]result = rotate.rotateMatrixRight(input);
        assertThat(result, is(expect));
    }
}
