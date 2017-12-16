package ru.job4j.professions;

public class Engineer extends Professions {

    String education;
    String speakLanguage;

    public void repairEqupment() {

    }

    public void driveCar() {

    }

    public Engineer(String name, int age, int expirience) {
        super(name, age, expirience);
    }

    public String repair(Professions professions){
        return "Все исправлено";
    }
}
