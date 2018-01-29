package ru.job4j.collections;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertationTest {
    @Test
    public void test1() {
        int[][] test = new int[][]  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> result = new ArrayList<>();
        Convertation convertation = new Convertation();
        result = convertation.toList(test);
        List<Integer> expected = new ArrayList<>(9);
        int j = 1;
        for (int i = 0; i < 9; i++) {
            expected.add(j);
            j++;
        }
        assertThat(result, is(expected));
    }

    @Test
    public void test2() {
        List<Integer> test = new ArrayList<>();
        int j = 1;
        for (int i = 0; i < 7; i++) {
            test.add(j);
            j++;
        }
        Convertation convertation = new Convertation();
        int[][] tmp = convertation.toArray(test, 3);
        int[][] expected = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 0, 0}};
        assertThat(tmp, is(expected));
    }



}