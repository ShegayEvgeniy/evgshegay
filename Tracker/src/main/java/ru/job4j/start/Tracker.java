package ru.job4j.start;

import ru.job4j.models.*;
import java.util.*;

public class Tracker {

	//private Item[]items = new Item[100];
	private List<Item> items = new ArrayList<>();
	//private    int position = 0;
	private static final Random RN = new Random();


	public Item add(Item item) {  //добавление заявки

		item.setId(this.generateId());
	/*	this.items [position] = item;
		position++;
		return item;*/
	    items.add(item);
	    return item;
	}

		    public void edit(Item fresh) {
		        for (int index = 0; index < items.size(); index++) {
			          Item item = items.get(index);
			         if (item != null && item.getId().equals(fresh.getId())) {
				            items.add(index, fresh);
				             break;
				           }
			         }

				   }

	public List<Item> replace(String id, Item item) {  //редактируем заявку
		for (int i = 0; i < items.size(); i++) {

			if (id.equals(items.get(i).getId())) {
				items.add(i, item);
				break;
			}

		}
		return items;
	}



	public void delete(String id) { //удаляем заявку по id
        for (int i = 0; i < items.size(); i++) {
			if (items.get(i).getId().equals(id)) {
				items.remove(i);
				break;
			}
		}
	}


	public List<Item> findAll(List<Item> items) {   // возвращает копию массива без пустых элементов
		int i = 0;
		for (Item item : items) {
			//items[i] = item;

			if (items.get(i) == item) {
				i++;
			}
			if (i == items.size()) {
				break;
			}
		}
		return items;
	}

	public List<Item> findByName(String key) {  //поиск объекта по имени
		//int i = 0;
		//int count = 0;
		//Item[] tmp1 = new Item[2];
		List<Item> tmp1 = new ArrayList<>();

	/*	for (Item item : items) {
			if (count < position) {
				count++;
				if (item.getName().equals(key)) {
					tmp1[i] = item;
					i++;
				}
			} else if (count == position) {
				break;
			}
		}*/
	    for (Item item : items) {
	    	if (item.getName().equals(key)) {
	    		tmp1.add(item);
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

	public List<Item> getAll() {  // показываем все заполненные ячейки


			// Item[] result = new Item[position];
            List<Item> result = new ArrayList<>();
		for (int index = 0; index < items.size(); index++) {
			result.add(items.get(index));
		}
		return result;
	}
}