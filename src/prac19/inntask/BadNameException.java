package prac19.inntask;

public class BadNameException extends RuntimeException {
    public BadNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadNameException(String message) {
        super(message);
    }
}
