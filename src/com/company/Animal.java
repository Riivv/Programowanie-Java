package com.company;

public class Animal
{

    void sell(Human seller, Human buyer, Double price)
    {
        Animal item = seller.pet;

        if(seller.pet==null)
        {
            System.out.println("Seller has no animal");
        }
        if(buyer.cash<price)
        {
            System.out.println("Buyer has no cash");
        }
        buyer.cash =- price;
        seller.cash =+ price;
        seller.pet = null;
        buyer.pet = item;
        System.out.println( seller+" just sold "+ item + " to " + buyer + " for " + price);
        //człowiek moze posiadać zwierzę, ale human nie ma nic wspólnego z klasą animal poza tym (no moze jeszcze package)
    }
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
