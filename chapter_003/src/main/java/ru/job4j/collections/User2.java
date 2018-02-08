package ru.job4j.collections;


public class User2 implements Comparable<User2> {

    private String name;
    private int age;

    public User2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User2{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    public User2() {
    }

    @Override
    public int compareTo(User2 user) {

        return Integer.compare(this.age, user.age);
    }


}
