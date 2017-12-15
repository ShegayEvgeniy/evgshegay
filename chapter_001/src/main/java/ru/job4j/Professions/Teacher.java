package ru.job4j.Professions;

public class Teacher extends Profession {
    String subject;
    String hobby;

    public Teacher(String name, int age, int expirience) {
        super(name, age, expirience);

    }

    public String teach(Engineer en) {

        return "Буду тебя учить уму разуму";
    }

    public void fillDiary() {

    }
}
