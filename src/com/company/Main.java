package com.company;
import devices.Car;
import devices.Phone;
public class Main {

    public static void main(String[] args)
    {
        System.out.println();
        Human me = new Human();
        me.set_salary(-1200);
        Car bmw = new Car("E46", "BMW", 1000.0);
        Car bmw1 = new Car("E46", "BMW", 1000.0);
        System.out.println(bmw1.equals(bmw));
        Car.mass = 1200;




    }
}
