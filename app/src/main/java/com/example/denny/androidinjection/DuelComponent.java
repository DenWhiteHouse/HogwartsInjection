package com.example.denny.androidinjection;

import dagger.Component;

@Component
interface  DuelComponent{
    WizardDuel getDuel();
}