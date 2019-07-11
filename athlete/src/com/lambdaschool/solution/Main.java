package com.lambdaschool.solution;

public class Main
{
    public static void main(String[] args)
    {
        String athleteType;
        AthleteCreationInjector injector;
        Processor app;

        // Create a Track Athlete
        athleteType = "Track";
        injector = new TrackAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete(athleteType);

        // Create a Hockey Athlete
        athleteType = "Hockey";
        injector = new HockeyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete(athleteType);


        // Create a Rugby Athlete
        athleteType = "Rugby";
        injector = new RugbyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete(athleteType);

        // Create a Baseball Athlete
        athleteType = "Baseball";
        injector = new BaseballAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete(athleteType);

    }
}
