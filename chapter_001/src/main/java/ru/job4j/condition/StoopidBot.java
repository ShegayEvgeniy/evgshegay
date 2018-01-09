package ru.job4j.condition;

/**
 * @author Evgeniy Shegay (terrasan30@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class StoopidBot {


	String a = "Привет, Бот.";
	String b = "Привет, умник.";
	String c = "Пока.";
	String d = "До скорой встречи.";
	String e = "Сколько будет 2 + 2?";
	String h = "Это ставит меня в тупик. Спросите другой вопрос.";
	String g;

	
	public String answer(String question) {

		if (question.equals(a)) {
			g = b;
		}
		if  (question.equals(c)) {
			g = d;
		}
		if (question.equals(e)) {
			g = h;
		}
		return g;

	}


}
