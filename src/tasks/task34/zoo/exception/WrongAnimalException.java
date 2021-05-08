package tasks.task34.zoo.exception;

public class WrongAnimalException extends Exception {
    public WrongAnimalException() {
        System.err.println("недопустимое животное");
    }
}
