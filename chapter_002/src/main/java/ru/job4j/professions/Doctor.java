package ru.job4j.professions;

public class Doctor extends Professions {
    String colorUniform;
    String medicalEducation;

    public Doctor(String name, int age, int expirience) {
        super(name, age, expirience);
    }

    public String healPeople(Professions professions) {
        return "Я здоров";
    }

    public void giveAdvice() {

    }

}
