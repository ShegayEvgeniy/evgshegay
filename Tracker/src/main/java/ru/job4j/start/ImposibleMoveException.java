package ru.job4j.start;

//Класс реализует собственное исключение

public class ImposibleMoveException extends Exception {
    public ImposibleMoveException() {
    }

    public ImposibleMoveException(String message) {
        super(message);
    }

    public ImposibleMoveException(String message, Throwable cause) {
        super(message, cause);
    }

    public ImposibleMoveException(Throwable cause) {
        super(cause);
    }

    public ImposibleMoveException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
