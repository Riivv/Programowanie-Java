package devices;

import creatures.Human;

import java.util.ArrayList;

abstract public class Car extends Device
{
    public static int mass = 1000;
    public Double value;
    public Car (String Model, String Producer, Double value)
    {
        this.model = Model;
        this.producer = Producer;
        this.value = value;
    }
    public String toString()
    {
        return model+" "+producer+" "+value;
    }
    String model;
    String producer;
    @Override
    public void turnON() {
        if (mode == false)
            mode = true;
    }
    abstract void refuel();




}
