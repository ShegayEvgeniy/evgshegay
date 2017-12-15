package ru.job4j;

import ru.job4j.Professions.Profession;
import ru.job4j.Professions.Teacher;

public class Doctor extends Profession {

    String colorUniform;
    String medicalEducation;

    public Doctor(String name, int age, int expirience) {
        super(name, age, expirience);
    }

    public String healPeople(Teacher t) {
        return "Я здоров";
    }

    public void giveAdvice() {

    }

}
