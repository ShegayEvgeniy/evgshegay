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



}