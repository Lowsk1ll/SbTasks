package tasks.task34.zoo.exception;

public class WrongSpeedException extends Exception{
    public WrongSpeedException() {
        System.err.println("недопустимая скорость");
    }
}
