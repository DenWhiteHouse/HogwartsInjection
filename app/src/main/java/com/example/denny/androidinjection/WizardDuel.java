package com.example.denny.androidinjection;

import javax.inject.Inject;

public class WizardDuel {
    private Gryffindor gryffindor;
    private Slytherin slytherin;

    @Inject
    public WizardDuel(Gryffindor gryffindor,Slytherin slytherin){
        this.gryffindor = gryffindor;
        this.slytherin = slytherin;
    }

    public String getHouses(){
        return (this.gryffindor.getHouse() + " and " + this.slytherin.getHouse());
    }
}
