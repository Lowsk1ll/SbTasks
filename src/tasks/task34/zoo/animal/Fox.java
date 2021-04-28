package tasks.task34.zoo.animal;

import tasks.task34.zoo.Animal;

public class Fox extends Animal {

    public Fox() {

    }

    public Fox(Integer age, String name) {
        super(age, name);
    }

    @Override
    public void sound() {
        System.out.println("yelp");
    }

    @Override
    public void move() {
        System.out.println("move slowly");
    }
}
