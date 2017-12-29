package ru.job4j.start;

import ru.job4j.models.*;
import java.util.*;

public class Tracker {
	
	private Item[]items = new Item[100];
	private    int position = 0;
	private static final Random RN = new Random();

	
	public Item add(Item item) {  //добавление заявки

		item.setId(this.generateId());
		this.items [position] = item;
		position++;
		return item;
	}

    public void edit(Item fresh) {
         for (int index = 0; index < items.length; index++) {
          Item item = items[index];
           if (item != null && item.getId().equals(fresh.getId())) {
             items[index] = fresh;
              break;
            }
          }

    }
	
	public Item[] replace(String id, Item item) {  //редактируем заявку
		for (int i = 0; i < position; i++) {

				if (id.equals(items[i].getId())) {
					this.items[i] = item;
				}

		}
		return items;
	}



	public void delete(String id) { //удаляем заявку по id

		for (Item item : items) {
			if (item.getId().equals(id)) {
				Item[] tmp = new Item[100];
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

	public String generateId() {  // генерируем id
		return String.valueOf(RN.nextInt(100));
	}
	
	public Item[] getAll() {  // показываем все заполненные ячейки

		 Item[] result = new Item[position];

		for (int index = 0; index < result.length; index++) {
			result[index] = items[index];
		}
		return result;
	}
}