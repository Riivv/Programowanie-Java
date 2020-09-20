package creatures;

public class FarmAnimal extends Animal
{

    public FarmAnimal(String spiecies) {
        super(spiecies);
    }
    void beEaten(Animal predator, Animal prey)
    {
        for(int i=0;i<prey.weight;i++)
        {
            predator.feed();
        }
        prey.weight = 0;
    }
}
