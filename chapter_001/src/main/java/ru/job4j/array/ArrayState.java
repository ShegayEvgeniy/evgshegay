package ru.job4j.array;

/**
 * Created by Evgeniy on 03.12.2017.
 */
public class ArrayState {

    public  boolean inSorted(int[] a) {

            for (int i = 0; i < a.length - 1; ++i) {
                if (a[i] > a[i + 1]) {
                    return false;
                }
            }
        return true;
    }
}
