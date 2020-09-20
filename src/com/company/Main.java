package com.company;

public class Main {

    public static void main(String[] args)
    {
        Human ja = new Human();
        ja.set_salary(-1200);


        Car bmw = new Car("E46", "BMW", 1000);
        Car.mass = 1200;
        Animal dog = new Animal("dog");
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();


    }
}
