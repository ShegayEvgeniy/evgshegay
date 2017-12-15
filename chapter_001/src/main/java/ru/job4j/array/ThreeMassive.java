package ru.job4j.array;


/**
 * Created by Evgeniy on 06.12.2017.
 */

public class ThreeMassive {

    public int[] summ(int[]a, int[]b) {

        int[] first = a;
        int[] second = b;
        int[] third = new int[first.length + second.length];
        System.arraycopy(first, 0, third, 0, first.length);
        System.arraycopy(second, 0, third, first.length, second.length);
        // если его упорядочить то использую алгоритм сортировки пузырьком
        return third;
    }
}

