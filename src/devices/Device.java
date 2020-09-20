package devices;


public abstract class Device
{
    String producer;
    Boolean mode = false;
    Integer yearofproduction=1990;
    public String toString()
    {
        return producer + " " + mode + " " + yearofproduction;
    }
    public abstract void turnON();




}
