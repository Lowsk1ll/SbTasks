package tasks.task34.zoo.exception;

public class WrongAgeException extends Exception{
    public WrongAgeException() {
        System.err.println("недопустимый возраст");
    }
}
