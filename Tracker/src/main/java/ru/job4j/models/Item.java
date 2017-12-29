
package ru.job4j.models;

public class Item {
	public String name;
	public String description;
	public long create;
	private String id;

	public Item(String name, String description, long create) { // constructor
		this .name = name;
		this.description = description;
		this.create = create;
	}
	public Item() { }  // конструктор без параметров по умолчанию

	public String getName() {

		return this.name;
	}

	public String getDescription() {
		return this.description;
	}

	public long getCreate() {

		return this.create;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

}

