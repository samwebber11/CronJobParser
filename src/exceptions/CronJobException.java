package exceptions;

/** Exception class inherited from RuntimeException. */
public class CronJobException extends RuntimeException {

    public CronJobException(String message) {
        super(message);
    }

    public CronJobException(String message, Throwable cause) {
        super(message, cause);
    }
}
