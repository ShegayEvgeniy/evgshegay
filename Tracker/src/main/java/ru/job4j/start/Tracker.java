package ru.job4j.start;

import ru.job4j.models.*;
import java.util.*;

public class Tracker {
	
	private Item[]items = new Item[100];
	private int position = 0;
	private static final Random RN = new Random();
	
	public Item add(Item item) {  //добавление заявки

		item.setId(this.generateId());
		this.items [position++] = item;
		return item;
	}
	
	public Item[] replace(String id, Item item) {
		for (int i = 0; i < items.length; i++) {
			if (i < position) {
				if (id.equals(items[i].getId())) {
					this.items[i] = item;
				}
			} else if (i == position) {
			   break;
			}
		}
		return items;
	}



	public void delete(String id) { //удаляем заявку по id

		for (Item item : items) {
			if (item.getId().equals(id)) {
				Item[]tmp = new Item[100];
						System.arraycopy(items, 1, tmp, 0, 1);
						System.arraycopy(tmp, 0, items, 0, 1);
                        position--;
                        break;
				}
			}

	}
	
	public Item[] findAll(Item[] items) {   // возвращает копию массива без пустых элементов
		 int i = 0;
			 for (Item item : items) {
				 items[i] = item;
				   i++;
				   if (i == position) {
					 break;
				 }
			 }
		return items;
	}
	
	public Item[] findByName(String key) {  //поиск объекта по имени
		int i = 0;
		int count = 0;
		Item[] tmp1 = new Item[2];

			for (Item item : items) {
				if (count < position) {
					count++;
					if (item.getName().equals(key)) {
						tmp1[i] = item;
						i++;
					}
				} else if (count == position) {
					break;
				}
			}
		return tmp1;
	}

	public Item findById(String id) {  // получение заявки по id
		Item result = null;
		for (Item item:items) {
			if (item != null && item.getId().equals(id)) {
				result = item;
			    break;
			}
		}
		return result;
	}

	String generateId() {  // генерируем id
		return String.valueOf(RN.nextInt(100));
	}
	
	public Item[] getAll() {
		Item[] result = new Item[this.position];
		for (int index = 0; index != this.position; index++) {
			result[index] = this.items[index];
		}
		return result;
	}
}