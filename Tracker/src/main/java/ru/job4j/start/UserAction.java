package ru.job4j.start;

public interface UserAction {
	
	int key(); // ключ который определяет выбор действия
	
	void execute(Input input, Tracker tracker); // метод выполняет основное действие (удаление , поиск)
	
	String info(); // метод сообщает пользователю что данный метод делает
	
	
	
	
	
}