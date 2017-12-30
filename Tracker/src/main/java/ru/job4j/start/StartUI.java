
package ru.job4j.start;



public class StartUI {
	

	private Input input;
	private int[] ranges = new  int[6];


      public StartUI(Input input) {
 	   this.input = input;
     }

     public void fillRanges(MenuTracker menu) {  // методо заполняет массив ranges

		  UserAction[] tmp = menu.getActions();
		 for (int i = 0; i < tmp.length; i++) {
			 ranges[i] = i;
		 }
	 }


     public void init() {
      	Tracker tracker = new Tracker();
      	MenuTracker menu = new MenuTracker(this.input, tracker);
      	menu.fillActions();
      	fillRanges(menu);
      	do {
      		menu.show();
			menu.select(input.ask("Select", ranges));
		} while (!"y".equals(this.input.ask("Exit?(y): ")));

	 }

	public static void main(String[] args) {
		Input input = new ValidateInput();
		new StartUI(input).init();
	}

}
