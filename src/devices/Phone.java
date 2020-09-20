package devices;

public class Phone extends Device
{
    static final URL download = new URL();

    public void installAnApp(String appname)
    {

    }
    public void installAnApp(String appname,Double version)
    {

    }
    public void installAnApp(String appname,Double version, Double serveraddress)
    {

    }
    public void installAnApp(String appname[])
    {

    }
    @Override
    public void turnON()
    {
        if(mode==false)
        mode=true;
    }
}
