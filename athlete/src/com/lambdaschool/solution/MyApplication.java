package com.lambdaschool.solution;

public class MyApplication implements Processor
{
    public AthleteCreation createAth;

    public MyApplication(AthleteCreation createAth)
    {
        this.createAth = createAth;
    }


    @Override
    public void displayAthlete()
    {
        createAth.displayAthlete();
    }
}