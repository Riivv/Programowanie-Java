package devices;

public abstract class Device
{
    String producer;
    Boolean mode = false;
    Integer yearofproduction;
    public String toString()
    {
        return producer + " " + mode + " " + yearofproduction;
    }
    public abstract void turnON();


}
