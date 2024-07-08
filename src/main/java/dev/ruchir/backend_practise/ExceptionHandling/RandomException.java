package dev.ruchir.backend_practise.ExceptionHandling;

public class RandomException extends RuntimeException{
    public RandomException() {
        super("Random exception occurred");
    }

    public RandomException(String message) {
        super(message);
    }

}
