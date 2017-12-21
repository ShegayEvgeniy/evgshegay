
package ru.job4j.start;
import ru.job4j.models.Item;



public class StartUI {
	
	private final Input input;
	private final Tracker tracker;
	private static final String ADD = "0";
	private static final String SHOW = "1";
	private static final String EDIT = "2";
	private static final String DELETE = "3";
	private static final String FINDBYID = "4";
	private static final String FINDBYNAME = "5";
	private static final String EXIT = "6";
	
	public StartUI(Input input,Tracker tracker){
		this.input = input;
		this.tracker = tracker;
	}


	
	public void showMenu(){
		System.out.println("Menu");
		System.out.println("Add menu item enter 0");
		System.out.println("Show all items - enter 1");
		System.out.println("Edit item - enter 2");
		System.out.println("Delete item enter 3");
		System.out.println("Find item by id - enter 4");
		System.out.println("Find items by name - enter 5");
		System.out.println("Exit - enter 6");

	}
	
	public void init (){
		boolean  exit = false;
		while(!exit) {
			this.showMenu();

			String name = this.input.ask("Select the menu item");
			if(ADD.equals(name)){
				this.createItem();
			}else if (SHOW.equals(name)){
				this.show();
			}else if (EDIT.equals(name)){
				this.edit();
			}else if (DELETE.equals(name)) {
				this.delete();
			}else if (FINDBYID.equals(name)) { // поиск будет  идти через имя объекта т.к пользователь не знает id
				this.findById();
			}else if (FINDBYNAME.equals(name)) {
				this.Name();
			}else if (EXIT.equals(name)) {
				exit = true;
			}
		}
	}
	
	public void createItem(){
		
		System.out.println("Create new item");
		String name = input.ask("Enter the name of the application");
		String desc = input.ask("Enter the description of the application");
		Item item = new Item(name,desc,1);
		Item result = tracker.add(item);
		System.out.println("Заявка  " + result.getName() + "  создана");
	}
	
	public void edit() {
		System.out.println("Редактирование заявки");
		String name = input.ask("Введите имя редактируемой завки");
		Item[] edit2 = tracker.findByName(name);
		String name1 = input.ask("Введите имя новой заяки");
		String desc = input.ask("Введите описание новой заявки");
		Item item = new Item(name1,desc,2);
		for(Item item1:edit2){
			if((item1.getName()).equals(name)) {
				Item [] result = tracker.replace((item1.getId()),item);
				break;
			}
		}
		System.out.println("Заявка  " +item.getName() + "   отредактирована");
	}
	
	public void delete() {
		System.out.println("Удаляем заявку");
		String name = input.ask("Введите имя удаляемой заявки");
		Item[] find = tracker.findByName(name);
		for (Item item1 : find) {
			if ((item1.getName()).equals(name)) {
				tracker.delete(item1.getId());
				System.out.println("Заявка " + item1.getName() + " удалена");
				break;



			}

		}
	}
	
	public void findById(){
			System.out.println("Поиск объекта по его id");  //поиск идет через имя заявки тк клиент не знает id заявки
			String name = input.ask("Введите имя объекта");
			Item[] find1 = tracker.findByName(name);
			for (Item item1 : find1) {
				if ((item1.getName()).equals(name)) {
					Item result = tracker.findById(item1.getId());
					System.out.println("Заявка  " + result.getName() + "  найдена");
					break;
				}
			}
	}
	
	public void Name() {
		System.out.println("Поиск объекта по его имени");
		String name = input.ask("Введите имя объекта");
		Item[] find = tracker.findByName(name);
		for (Item item1 : find) {
			if ((item1.getName()).equals(name)) {
				System.out.println("Заявка  " + item1.getName() + "  найдена");
                break;
			}
		}
	}
	
	public void show() {
		System.out.println("Вывод всех заявок" );
		 Item [] array = tracker.getAll();
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void main(String[]args) {
		
		System.out.println("Вход в меню");
		ConsoleInput consol = new ConsoleInput();
		Tracker tracker = new Tracker();
		StartUI start = new StartUI(consol,tracker);
		start.init();
		System.out.println("Вы вышли из меню");
	
		
		
	}
}
