package ru.job4j.Professions;

public abstract class Profession {

   private String name;
    private int age;
   private int expirience;

    public void eat() {

    }

    public void sleep() {

    }

    public void work() {

    }
    public Profession() {

    }

    public Profession(String name, int age, int expirience) {
        this.name = name;
        this.age = age;
        this.expirience = expirience;
    }

}
