package ru.job4j.collections;

import java.util.Comparator;

public class User2Comparator2 implements Comparator<User2> {


    @Override
    public int compare(User2 o1, User2 o2) {
        int result;
        result = o1.getName().compareTo(o2.getName());
        if (result == 0) {
            result = o1.getAge() - o2.getAge();
        }
        return result;
    }
}
