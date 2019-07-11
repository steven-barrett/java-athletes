package com.lambdaschool.solution;

public class MyApplication implements Processor
{
    private AthleteCreation createAth;

    public MyApplication(AthleteCreation createAth)
    {
        this.createAth = createAth;
    }

    public MyApplication()
    {
        super();
    }

    @Override
    public void displayAthlete(String sport)
    {
        System.out.println(sport + " Athlete");
    }
}