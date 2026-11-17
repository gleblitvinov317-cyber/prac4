package prac19.inntask;

public class BadInnException extends RuntimeException {
    public BadInnException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadInnException(String message) {
        super(message);
    }
}
