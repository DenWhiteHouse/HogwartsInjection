package com.example.denny.androidinjection;

import javax.inject.Inject;

public class Gryffindor implements HogwartsWizard {
    private static final String House = "Gryffindor";

    @Inject
    public Gryffindor(){}

    @Override
    public String getHouse() {
        return this.House;
    }
}
