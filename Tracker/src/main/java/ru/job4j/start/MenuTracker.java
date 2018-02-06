package ru.job4j.start;

import ru.job4j.models.Item;
import ru.job4j.models.Task;

import java.util.ArrayList;
import java.util.List;


class EditItem extends BaseAction {

	protected EditItem(int key, String name) {
		super(key, name);
	}

		public void execute(Input input, Tracker tracker) {
			String id = input.ask("Please,enter the task id");
			String name =  input.ask("Please enter the new name");
			String desc =  input.ask("Please enter the task desc");
			Task task = new Task(name, desc);
            task.setId(id);
            tracker.edit(task);
            
		}
}

  class FindItemById  extends BaseAction {


	  protected FindItemById(int key, String name) {
		  super(key, name);
	  }



	  @Override
	  public void execute(Input input, Tracker tracker) {
      String id = input.ask("Please enter the task id");
      Item tmp = tracker.findById(id);
      System.out.println("task found by id  " + tmp.getName());
	  }


  }

public class MenuTracker {

	private Input input;
	private Tracker tracker;
	//private int position = 0;

	/*public UserAction[] getActions() {
		return actions;
	}*/

	public List<UserAction> getActions() {
		return actions;
	}

	//private UserAction[] actions = new UserAction[8]; //массив содержит данные о том какие дейсвия может совершить
	private List<UserAction> actions = new ArrayList<>();                                                 //пользователь


	public MenuTracker(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}

	public MenuTracker() {
	}

	public void addActions(UserAction action) {
		//this.actions[position++] = action;
		actions.add(action);
	}

	public void fillActions() {       //метод создает события
		/*this.actions[position++] = this.new AddItem(0, "Add new item"); //создаем экземпляр внутреннего не статичного класса
		this.actions[position++] = new MenuTracker.ShowItems(1, "Show all items"); //создаем экземпляр внутреннего статичного класса
        this.actions[position++] = new EditItem(2, "Edit item"); // создаем экземпляр внешнего класса
		this.actions[position++] = this.new DeleteItem(3, "Delete item"); //внутренний не статичный класс
		this.actions[position++] = new MenuTracker.FindItemByName(4, "Find item by name"); //static class
		this.actions[position++] = new FindItemById(5, "Find item by id"); //внешний класс
		this.actions[position++] = this.new DeleteItem(3, "Delete item");*/
		actions.add(new AddItem(0, "Add new item"));
		actions.add(new MenuTracker.ShowItems(1, "Show all items"));
		actions.add(new EditItem(2, "Edit item"));
		actions.add(new DeleteItem(3, "Delete item"));
		actions.add(new MenuTracker.FindItemByName(4, "Find item by name"));
		actions.add(new FindItemById(5, "Find item by id"));
		actions.add(new DeleteItem(3, "Delete item"));
	}

    public void select(int key) {  //метод выполняет наши действия оторые выбрал пользователь
     actions.get(key).execute(this.input, this.tracker);

     }

	public void show() { //метод печатает меню
		for (UserAction action : actions) {
          if (action != null) {
        System.out.println(action.info());
		   }
        }
	}

	private class DeleteItem extends BaseAction {


		protected DeleteItem(int key, String name) {
			super(key, name);
		}



		@Override
		public void execute(Input input, Tracker tracker) {
			String name = input.ask("Please,enter the task name");
			List<Item> tmp1  = tracker.findByName(name);
			for (Item tmp : tmp1) {
			if (tmp != null && tmp.getName().equals(name)) {
				tracker.delete(tmp.getId());
				}
			}
		}

	}

	private class AddItem extends BaseAction {

		protected AddItem(int key, String name) {
			super(key, name);
		}


		public void execute(Input input, Tracker tracker) {
			String name = input.ask("Please,enter the task name");
			String desc =  input.ask("Please enter the task desc");
			tracker.add(new Task(name, desc));
		}

	}

     private static class ShowItems extends BaseAction {
		 protected ShowItems(int key, String name) {
			 super(key, name);
		 }



		public void execute(Input input, Tracker tracker) {
			for (Item item : tracker.getAll()) {
            System.out.println(String.format("%s. %s", item.getId(), item.getName()));

            }
		}


	}

	private static class FindItemByName extends BaseAction {


		protected FindItemByName(int key, String name) {
			super(key, name);
		}



		@Override
		public void execute(Input input, Tracker tracker) {
        String name = input.ask("Please enter the task name");
			List<Item> tmp3  = tracker.findByName(name);
			for (Item tmp : tmp3) {
				if (tmp != null && tmp.getName().equals(name)) {
					System.out.println("task found");
				}
			}
		}


	}


}