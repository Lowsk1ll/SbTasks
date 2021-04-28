package tasks.task34.zoo;

import tasks.task34.zoo.animal.Fox;
import tasks.task34.zoo.animal.Wolf;
import tasks.task34.zoo.exception.AviaryCapacityException;
import tasks.task34.zoo.exception.AviaryExistException;
import tasks.task34.zoo.exception.WrongAnimalException;

public class Runner {
    public static void main(String[] args) {
        Aviary aviary1 = new Aviary(3);
        Aviary aviary2 = new Aviary(4,"южный");
        try {
            aviary1.add(new Wolf(4,"Борис"));
        } catch (WrongAnimalException | AviaryCapacityException | AviaryExistException e) {
            e.getCause();
        }
    }
}
