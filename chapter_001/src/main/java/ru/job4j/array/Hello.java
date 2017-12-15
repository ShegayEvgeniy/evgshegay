package ru.job4j.array;

/**
 * Created by Evgeniy on 10.12.2017.
 */

public class Hello {

    int count;
    public boolean contains(String origin, String sub) {

        char[]one = origin.toCharArray();
        char[]two = sub.toCharArray();
        for (int i = 0; i < one.length; i++) {
            count = 0;
            for (int j = 0; j < two.length && i + j < one.length; j++) {
                if (two[j] == one[i + j]) {
                    count++;
                } else {
                    break;
                }
            }
            if (count == two.length) {
                return true;
            }
        }
        return false;
    }
}
