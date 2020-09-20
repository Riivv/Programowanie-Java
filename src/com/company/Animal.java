package com.company;

public class Animal
{


    private double weight;
    static final Double dog_weight = 12.0;
    public Animal(String spiecies)
    {
        if(spiecies == "dog")
            weight = dog_weight;

    }

    void feed()
    {
        if(this.weight<=0)
        {
            System.out.println("I'm dead idiot");
        }
        else
            this.weight ++;
            System.out.println("YES YES GIMME ME FOOOD, my weight is: "+ this.weight);
    }
    void takeForAWalk()
    {
        if(this.weight<=0)
        {
            System.out.println("I'm dead idiot");
        }
        else if(this.weight<=2)
        {
            this.weight--;
            System.out.println("YES YES WALK WITH MA HUMIE, IMA HUNGRY GIMME FOOOOD, my weight is: " + this.weight);
        }
        else
            {
            this.weight--;
            System.out.println("YES YES WALK WITH MA HUMIE, my weight is: " + this.weight);
            }
    }
}
