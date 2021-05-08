package tasks.task34.zoo.animal;

import tasks.task34.zoo.Animal;


public class Rabbit extends Animal  {

    public Rabbit() {
    }

    public Rabbit(Integer age, String name) {
        super(age, name);
    }

    @Override
    public void sound() {
        System.out.println("squeak");
    }

    @Override
    public void move() {
        System.out.println("move so fast");
    }
}
