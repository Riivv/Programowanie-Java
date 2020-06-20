package com.company;

public class Main {

    public static void main(String[] args)
    {
        Car bmw = new Car("E46", "BMW");
        Car.mass = 1200;
        Animal dog = new Animal("dog");
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();


    }
}
