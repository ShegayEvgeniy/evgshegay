package ru.job4j.start;


import org.junit.Test;
import ru.job4j.models.Item;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        String[]one = {"0", "name1", "desc1", "1"};
        Input input = new StubInput(one);
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[0].getName(), is("name1"));
    }

    @Test
    public void whenUpdateThenTrackerUpdateValue() {
        Tracker tracker = new Tracker();
        Item item = new Item("name2", "desc2", 2);
        tracker.add(item);
        Item item2 = new Item("name3", "desc3", 3);
        String[] two = {"2", "name2", "name3", "desc3"};
        Input input = new StubInput(two);
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[0].getName(), is("name3"));

    }

    @Test
    public void whenAddItemAndThenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("name4", "desc4", 4);
        tracker.add(item);
        Item item2 = new Item("name5", "desc5", 5);
        tracker.add(item2);
        String[] three = {"3", "name4"};
        Input input1 = new StubInput(three);
        new StartUI(input1, tracker).init();
        assertThat(tracker.getAll()[0].getName(), is("name5"));

    }

    @Test
    public void whenAddItemAndFindById() { // я ищу заявку по имени тк пользователь не знает id
        Tracker tracker = new Tracker();
        Item item = new Item("name6", "desc6", 6);
        tracker.add(item);
        String[] four = {"4", "name6", item.getId()};
        Input input = new StubInput(four);
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[0].getName(), is("name6"));

    }

    @Test
    public void whenAddItemAndFindByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("name7", "desc7", 7);
        tracker.add(item);
        String[] five = {"5", "name7"};
        Input input = new StubInput(five);
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[0].getName(), is("name7"));

    }

    //тест , который проверяет вывод всех объектов не делал . Тк в условии сказано ,
    // что его будем делать в следующем задании

}