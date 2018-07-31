package com.example.denny.androidinjection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private DuelComponent component;
    private WizardDuel duel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button houseButton = findViewById(R.id.battle_button);

        //Setting Dagger2 - Remember Dagger will create the DaggerFileComponent its own
        component = DaggerDuelComponent.create();
        duel = component.getDuel();

        //Set the onClickListener to test Dagger2
        houseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, duel.getHouses(),Toast.LENGTH_SHORT).show();
            }
        });


    }
}
