package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class BubleSortTest {
	
	 @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        //напишите здесь тест, проверяющий сортировку массива из 10 элементов методом пузырька, например {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}.
		int[] input = {2, 4, 5, 7, 8, 9, 0, 3, 1, 6};
		BubleSort buble = new BubleSort();
		int[] output = buble.sort(input);
		int[] example = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		 assertThat(output, is(example));

		
    }
	
	
	
	
	
	
	
	
	
}