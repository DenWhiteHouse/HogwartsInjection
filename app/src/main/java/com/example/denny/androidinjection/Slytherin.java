package com.example.denny.androidinjection;

import javax.inject.Inject;

public class Slytherin implements HogwartsWizard {
    private static final String House = "Slytherin";

    @Inject
    public Slytherin(){}

    @Override
    public String getHouse() {
        return this.House;
    }
}
