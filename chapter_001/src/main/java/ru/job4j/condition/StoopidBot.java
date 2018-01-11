package ru.job4j.condition;

/**
 * @author Evgeniy Shegay (terrasan30@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class StoopidBot {


	private final  String A = "Привет, Бот.";
	private  final String B = "Привет, умник.";
	private  final String C = "Пока.";
	private  final String D = "До скорой встречи.";
	private  final String E = "Сколько будет 2 + 2?";
	private  final String H = "Это ставит меня в тупик. Спросите другой вопрос.";


	
	public String answer(String question) {
		String g = null;
		if (question.equals(A)) {
			g = B;
		}
		if  (question.equals(C)) {
			g = D;
		}
		if (question.equals(E)) {
			g = H;
		}
		return g;

	}


}
