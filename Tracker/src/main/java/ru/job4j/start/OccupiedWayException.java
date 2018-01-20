package ru.job4j.start;

// создал свое  собственное исключение - путь занят другими фигурами

public class OccupiedWayException extends Exception {
    public OccupiedWayException() {
    }

    public OccupiedWayException(String message) {
        super(message);
    }

    public OccupiedWayException(String message, Throwable cause) {
        super(message, cause);
    }

    public OccupiedWayException(Throwable cause) {
        super(cause);
    }

    public OccupiedWayException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
