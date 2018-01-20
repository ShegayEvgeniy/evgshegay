package ru.job4j.start;

//Создал свое  собственное исключение - фигура не обнаружена

public class FigureNotFoundException extends Exception {
    public FigureNotFoundException() {
    }

    public FigureNotFoundException(String message) {
        super(message);
    }

    public FigureNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public FigureNotFoundException(Throwable cause) {
        super(cause);
    }

    public FigureNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
