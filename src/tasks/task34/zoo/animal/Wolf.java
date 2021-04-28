package tasks.task34.zoo.animal;

import tasks.task34.zoo.Animal;

public class Wolf extends Animal {

    public Wolf() {
    }

    public Wolf(Integer age, String name) {
        super(age, name);
    }

    @Override
    public void sound() {
        System.out.println("howl");
    }

    @Override
    public void move() {
        System.out.println("move fast");
    }
}
