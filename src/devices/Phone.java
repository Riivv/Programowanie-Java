package devices;

public class Phone extends Device
{
    @Override
    public void turnON()
    {
        if(mode==false)
        mode=true;
    }
}
