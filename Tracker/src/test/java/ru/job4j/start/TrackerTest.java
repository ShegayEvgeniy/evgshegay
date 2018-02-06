package ru.job4j.start;


import org.junit.Test;
import ru.job4j.models.Item;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class TrackerTest {

    @Test
    public void addTest() {
        Tracker tracker = new Tracker();
        List<Item> items = new ArrayList<>();
        Item item = new Item("item1", "desc1", 12);
        //items.add(item);
        Item item2 = tracker.add(item);
        items = tracker.findByName("item1");
        assertThat(items.get(0), is(item2));
    }

    @Test
    public void deleteTest() {
        Tracker tracker = new Tracker();
        Item item = new Item("item2", "desc2", 13);
        tracker.add(item);
        Item next = new Item("item3", "desc3", 14);
        tracker.add(next);
        tracker.delete(item.getId());
        List<Item> tmp4 = new ArrayList<>();
        tmp4 = tracker.findByName("item3");
        assertThat(tmp4.get(0), is(next));
    }

    @Test
    public void findAll() {
        Tracker tracker = new Tracker();
        Item item = new Item("item4", "desc4", 15);
        tracker.add(item);
        Item second = new Item("item", "desc", 10);
        tracker.add(second);
        Item third = new Item("item5", "desc5", 16);
        tracker.add(third);
       // Item[]array = new Item[2];
        List<Item> array = new ArrayList<>();
        array = tracker.findAll(tracker.getAll());
        //Item[] expect = new Item[3];
        List<Item> expect = new ArrayList<>();
        expect.add(item);
        expect.add(second);
        expect.add(third);
        assertThat(array, is(expect));
    }

    @Test
    public void findByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("test", "desc6", 17);
        tracker.add(item);
        Item second = new Item("test2", "desc7", 18);
        tracker.add(second);
        Item third = new Item("test", "desc8", 19);
        tracker.add(third);
        String key = "test";
        List<Item> res = new ArrayList<>();
         res = tracker.findByName(key);
        //Item[] expect = new Item[2];
        List<Item> expect = new ArrayList<>();
        expect.add(item);
        expect.add(third);
        assertThat(res, is(expect));

    }

    @Test
    public void replaceTest() {
        Tracker tracker = new Tracker();
        Item item = new Item("test", "desc", 20);
        tracker.add(item);
        Item item2 = new Item("test3", "desc3", 22);
        item2.setId(item.getId());
        tracker.replace(item.getId(), item2);
        assertThat(tracker.findById(item.getId()).getName(), is(item2.getName()));
    }

    @Test
    public void findById() {
        Tracker tracker = new Tracker();
        Item one = new Item("test", "desc", 23);
        tracker.add(one);
        Item two = new Item("test2", "desc2", 24);
        tracker.add(two);
        assertThat(tracker.findById(one.getId()), is(one));


    }

    @Test
    public void getAll() {
        Tracker tracker = new Tracker();
        Item item = new Item("item1", "desc1", 25);
        tracker.add(item);
        Item two = new Item("two1", "desc2", 26);
        tracker.add(two);
        //Item[] expect = new Item[2];
        List<Item> expect = new ArrayList<>();
        expect.add(item);
        expect.add(two);
        assertThat(tracker.getAll(), is(expect));


    }
}