package ru.job4j.start;

public class MenuOutException  extends  RuntimeException {  //создали свое исключение которое вирт машина позволяет не обрабатывать

    public MenuOutException(String message) {
        super(message);
    }
}
