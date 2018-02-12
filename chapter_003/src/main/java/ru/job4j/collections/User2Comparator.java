package ru.job4j.collections;

import java.util.Comparator;

public class User2Comparator implements Comparator<User2> {

    @Override
    public int compare(User2 o1, User2 o2) {

        return Integer.compare(o1.getName().length(), o2.getName().length());
    }
}
