package tasks.task34.zoo.exception;

public class AviaryCapacityException extends Exception {
    public AviaryCapacityException() {
        System.err.println("достигнута максимальная вместимость вольера");
    }
}
