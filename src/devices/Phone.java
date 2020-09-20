package devices;

import creatures.Human;

import java.util.HashSet;

public class Phone extends Device
{
    HashSet apps = new HashSet();


    static final URL download = new URL();

    public void installAnApp(Application appname, Human owner)
    {
        if (owner.cash < appname.price)
            System.out.println("not enough money");
        else
            {
            apps.add(appname);
            owner.cash=-appname.price;
            }

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
