
package ru.job4j.start;


import java.util.List;

public class StartUI {
	

	private Input input;
	private Tracker tracker;
	private int[] ranges = new  int[8];


      public StartUI(Input input, Tracker tracker) {
 	   this.input = input;
 	   this.tracker = tracker;
     }

     public void fillRanges(MenuTracker menu) {  // методо заполняет массив ranges

		  List<UserAction> tmp = menu.getActions();
		 for (int i = 0; i < tmp.size(); i++) {
			 ranges[i] = i;
		 }
	 }


     public void init() {
      	Tracker tracker = new Tracker();
      	MenuTracker menu = new MenuTracker(this.input, tracker);
      	menu.fillActions();
      	UserAction deleteAction = new UserAction() {

			@Override
			public int key() {
				return 3;
			}

			@Override
			public void execute(Input input, Tracker tracker) {
             //todo
			}

			@Override
			public String info() {
				return "Delete";
			}
		};
      	menu.addActions(deleteAction);
      	fillRanges(menu);
      	do {
      		menu.show();
			menu.select(input.ask("Select", ranges));
		} while (!"y".equals(this.input.ask("Exit?(y): ")));

	 }

	public static void main(String[] args) {
		new StartUI(new ValidateInput(new ConsoleInput()), new Tracker()).init();
	}

}
