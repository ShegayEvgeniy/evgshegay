package ru.job4j.collections;



import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.util.*;

public class SortUserTest {



    @Test
    public void test() {

        List<User2> list = new ArrayList<>();
        User2 user1 = new User2("Ivan", 21);
        User2 user2 = new User2("Boris", 33);
        User2 user3 = new User2("Pavel", 32);
        User2 user4 = new User2("Nanasha", 19);
        User2 user5 = new User2("Masha", 12);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);
        Set<User2> result = new TreeSet<>();
        SortUser sortUser = new SortUser();
        result = sortUser.sort(list);
        Set<User2> expect = new TreeSet<>();
        expect.add(user4);
        expect.add(user1);
        expect.add(user3);
        expect.add(user2);
        expect.add(user5);
        assertThat(result, is(expect));
    }

    @Test
    public void testNameLength() {
        User2 user1 = new User2("Ivan", 2);
        User2 user2 = new User2("Boris", 33);
        User2 user4 = new User2("Natasha", 109);
        List<User2> test = new ArrayList<>();
        test.add(user4);
        test.add(user1);
        test.add(user2);
        List<User2> result;
        SortUser sortUser = new SortUser();
        result = sortUser.sortNameLength(test);
        List<User2> expect = new ArrayList<>();
        expect.add(user1);
        expect.add(user2);
        expect.add(user4);
        assertThat(result, is(expect));

    }

    @Test
    public void testNameAndAge() {
        User2 user = new User2("Dasha", 20);
        User2 user2 = new User2("Dasha", 45);
        User2 user3 = new User2("Andrey", 15);
        User2 user4 = new User2("Oleg", 30);
        List<User2> list = new ArrayList<>();
        list.add(user4);
        list.add(user);
        list.add(user3);
        list.add(user2);
        SortUser sortUser = new SortUser();
        List<User2> result;
        result = sortUser.sortByAllFields(list);
        List<User2> expect = new ArrayList<>();
        expect.add(user3);
        expect.add(user);
        expect.add(user2);
        expect.add(user4);
        assertThat(result, is(expect));


    }


}