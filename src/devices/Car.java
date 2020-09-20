package devices;

public class Car
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




}
