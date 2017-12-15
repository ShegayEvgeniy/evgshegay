package ru.job4j.array;

import static org.junit.Assert.*;
import org.junit.Test;


import static org.junit.Assert.assertThat;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;

/**
 * Created by Evgeniy on 28.11.2017.
 */
public class ArrayDuplicateTest {  

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
		String[] input = {"Liza", "Olga", "Liza", "Sveta", "Valeria"};
		String[] expect = {"Liza", "Olga", "Sveta", "Valeria"};
		ArrayDuplicate duplicate = new ArrayDuplicate();
		String[] result = duplicate.remove(input);
		assertThat(result, arrayContainingInAnyOrder(expect));
    }
}

