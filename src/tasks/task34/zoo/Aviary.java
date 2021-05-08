package tasks.task34.zoo;

import tasks.task34.zoo.exception.AviaryCapacityException;
import tasks.task34.zoo.exception.AviaryExistException;
import tasks.task34.zoo.exception.WrongAnimalException;

import java.util.HashSet;

public class Aviary {
    HashSet<Animal> aviary;
    int capacity;
    String name = "";


    public Aviary(int capacity){
        this.aviary= new HashSet<>(capacity);
        this.capacity =capacity;
    }
    public Aviary(int capacity,String name){
        this.aviary= new HashSet<>(capacity);
        this.capacity =capacity;
        this.name=name;
    }
    public void add(Animal animal) throws WrongAnimalException,AviaryCapacityException,AviaryExistException{
        if(this.name.isEmpty()){
            throw new AviaryExistException();
        }
        if(aviary.size()==capacity){
            throw new AviaryCapacityException();
        }
        if(aviary.add(animal)){
            throw new WrongAnimalException();
        }
    }
    public void remove(Animal animal) throws WrongAnimalException{
        if(!(aviary.remove(animal))){
            throw new WrongAnimalException();
        }
    }
}
