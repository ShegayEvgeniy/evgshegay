package ru.job4j.start;

import ru.job4j.models.Item;
import ru.job4j.models.Task;


class EditItem implements  UserAction {

        public int key() {
			return 2;
		}
		
		public void execute(Input input, Tracker tracker) {
			String id = input.ask("Please,enter the task id");
			String name =  input.ask("Please enter the new name");
			String desc =  input.ask("Please enter the task desc");
			Task task = new Task(name, desc);
            task.setId(id);
            tracker.edit(task);
            
		}
		
		public String info() {
			return String.format("%s. %s", this.key(), "Edit the new item");
			
		}



}

  class FindItemById  implements  UserAction {


	  @Override
	  public int key() {
		  return 5;
	  }

	  @Override
	  public void execute(Input input, Tracker tracker) {
      String id = input.ask("Please enter the task id");
      Item tmp = tracker.findById(id);
      System.out.println("task found by id  " + tmp.getName());
	  }

	  @Override
	  public String info() {
		  return  String.format("%s. %s", this.key(), "Find by id");
	  }
  }

public class MenuTracker {
	
	private Input input;
	private Tracker tracker;
	private UserAction[] actions = new UserAction[6]; //массив содержит данные о том какие дейсвия может совершить
	                                                    //пользователь
	
	public MenuTracker(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}
	
	
	public void fillActions() {       //метод создает события
		this.actions[0] = this.new AddItem(); //создаем экземпляр внутреннего не статичного класса
		this.actions[1] = new MenuTracker.ShowItems(); //создаем экземпляр внутреннего статичного класса
        this.actions[2] = new EditItem(); // создаем экземпляр внешнего класса
		this.actions[3] = this.new DeleteItem(); //внутренний не статичный класс
		this.actions[4] = new MenuTracker.FindItemByName(); //static class
		this.actions[5] = new FindItemById(); //внешний класс
	}
   
    public void select(int key) {  //метод выполняет наши действия оторые выбрал пользователь
     this.actions[key].execute(this.input, this.tracker);

     }
	
	public void show() { //метод печатает меню
		for (UserAction action : this.actions) {
          if (action != null) {
        System.out.println(action.info());
		   }
        }
	}

	private class DeleteItem implements UserAction {


		@Override
		public int key() {
			return 3;
		}

		@Override
		public void execute(Input input, Tracker tracker) {
			String name = input.ask("Please,enter the task name");
			Item[] item = tracker.findByName(name);
			for (Item tmp : item) {
			if (tmp != null && tmp.getName().equals(name)) {
				tracker.delete(tmp.getId());
				}
			}
		}

		@Override
		public String info() {
			return String.format("%s. %s", this.key(), "Delete the  item");
		}
	}
	
	private class AddItem implements UserAction {  //внутренний класс может быть статичным и нет
		
		public int key() {
			return 0;
		}
		
		public void execute(Input input, Tracker tracker) {
			String name = input.ask("Please,enter the task name");
			String desc =  input.ask("Please enter the task desc");
			tracker.add(new Task(name, desc));
		}
		
		public String info() {
			return String.format("%s. %s", this.key(), "Add the new item");
			
		}
	}

     private static class ShowItems implements UserAction {  //внутренний класс может быть статичным и нет
		
		public int key() {
			return 1;
		}
		
		public void execute(Input input, Tracker tracker) {
			for (Item item : tracker.getAll()) {
            System.out.println(String.format("%s. %s", item.getId(), item.getName()));

            }
		}
		
		public String info() {
			return String.format("%s. %s", this.key(), "Show all items ");
			
		}
	}

	private static class FindItemByName implements UserAction {


		@Override
		public int key() {
			return 4;
		}

		@Override
		public void execute(Input input, Tracker tracker) {
        String name = input.ask("Please enter the task name");
			Item[] item = tracker.findByName(name);
			for (Item tmp : item) {
				if (tmp != null && tmp.getName().equals(name)) {
					System.out.println("task found");
				}
			}
		}

		@Override
		public String info() {
				return String.format("%s. %s", this.key(), " task found by name ");
		}
	}


}