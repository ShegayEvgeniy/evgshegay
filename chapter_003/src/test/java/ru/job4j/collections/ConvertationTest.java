package ru.job4j.collections;


import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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

    @Test
    public void test3() {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6, 7};
        List<Integer> expect = new ArrayList<>();
        int j = 1;
        for (int i = 0; i < 7; i++) {
            expect.add(j);
            j++;
        }
        Convertation convertation = new Convertation();
        List<Integer> test = new ArrayList<>();
         test = convertation.convert(Arrays.asList(a, b));
         assertThat(test, is(expect));
    }

    @Test
    public void test4() {
        User user1 = new User("Jack", "New York", 11);
        User user2 = new User("John", "Mexico", 122);
        User user3 = new User("Stefan", "Mistic Falls", 13);
        User user4 = new User("Daemon", "Mistic Falls", 33);
        List<User> user = new ArrayList<>();
        user.add(user1);
        user.add(user2);
        user.add(user3);
        user.add(user4);
        UserConvert userConvert = new UserConvert();
        HashMap<Integer, User> result = new HashMap<>();
        result = userConvert.process(user);
        HashMap<Integer, User> expect = new HashMap<>();
        expect.put(11, user1);
        expect.put(122, user2);
        expect.put(13, user3);
        expect.put(33, user4);
        assertThat(result, is(expect));
    }

}