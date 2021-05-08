package tasks.task34.zoo.exception;

public class AviaryExistException extends Exception {
    public AviaryExistException() {
        System.err.println("Вольера не существует");
    }
}
