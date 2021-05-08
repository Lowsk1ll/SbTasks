package tasks.task34.zoo;

import tasks.task34.zoo.exception.WrongAgeException;
import tasks.task34.zoo.exception.WrongSpeedException;

import java.util.Objects;

public abstract class Animal implements Soundable,Moveable{
    private Integer age;
    private String name;
    private boolean isAlive = true;


    public Animal() {
    }

    public Animal(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public void die(){
        this.isAlive=false;
    }

    public void setAge(Integer age) throws WrongAgeException {
        if(age<0 | age>100){
            throw new WrongAgeException();
        }
        this.age = age;
    }
    public void move(int speed) throws WrongSpeedException {
        if(speed<0 | speed>200){
            throw new WrongSpeedException();
        }
        System.out.println("move with "+speed+"km/h");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return isAlive == animal.isAlive &&
                Objects.equals(age, animal.age) &&
                Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, isAlive);
    }
}
