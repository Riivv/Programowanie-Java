package com.company;
import java.util.Date;
import devices.Car;

public class Human {
    String dates[];
    Double salaries[];
    Animal pet;
    public Car bmw;
    private Double salary=1000.0;
    private Integer checks = 0;
    public Car get_car()
    {
        return this.bmw;
    }
    public void set_car()
    {
        if (bmw.value>this.salary/12) System.out.println("get a new job");
        else if (bmw.value<this.salary) System.out.println("Me need a load for da car");
        else System.out.println("I pay cash");
    }

    public Double get_salary()
    {

        Date now = new Date();
        this.dates[this.checks] = now.toString();
        this.salaries[this.checks] = this.salary;
        System.out.println(dates[checks]);
        System.out.println(salaries[checks]);
        this.checks ++;
        System.out.println(new Date());
        return this.salary;
    }
    public void set_salary(double newsalary)
    {
        if(newsalary<0)
        System.out.println("You cannot have negative salary dude");
        else
            {
            this.salary = newsalary;
            System.out.println("New salary sent to book keepers");
            System.out.println("You have to get contract annex from Mrs Hania from HR");
            System.out.println("US and ZUS already know your salary so no point in hiding it");
            }

    }
    public String toString()
    {
        return bmw+" "+salary+" "+checks;
    }
}
