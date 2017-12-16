package ru.job4j.professions;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfessionsTest {

    @Test
    public void test1() {
        Engineer engineer = new Engineer("Nina", 30, 10);
        Doctor doc = new Doctor("Max", 33, 12);
        String result = doc.healPeople(engineer);
        String expect = "Я здоров";
        assertThat(expect, is(result));

    }

    @Test
    public void test2() {
        Teacher teacher = new Teacher("Tania", 24, 2);
        Engineer eng = new Engineer("Kirill", 20, 1);
        String result = teacher.teach(eng);
        String expect = "Буду тебя учить уму разуму";
        assertThat(expect, is(result));

    }
}
