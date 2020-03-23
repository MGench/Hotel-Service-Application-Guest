package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {

    private ImageButton roomservice, transportation, foodservice, maintenance, checkout, baggagecollection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        getSupportActionBar().setTitle("MainMenu");

        roomservice = (ImageButton) findViewById(R.id.roomservice);
        transportation = (ImageButton) findViewById(R.id.transportation);
        foodservice = (ImageButton) findViewById(R.id.foodservice);
        maintenance = (ImageButton) findViewById(R.id.maintenance);
        checkout = (ImageButton) findViewById(R.id.checkout);
        baggagecollection = (ImageButton) findViewById(R.id.baggagecollection);

        roomservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRoomServiceMenu(); // creates main menu method name
            }
        });

        class MyListener implements View.OnClickListener
        {
            String message = "This action is unavailable.";
            @Override
            public void onClick(View view){
                Toast.makeText(MainMenu.this,message,Toast.LENGTH_LONG).show();
            }
        }

        transportation.setOnClickListener(new MyListener());
        foodservice.setOnClickListener(new MyListener());
        maintenance.setOnClickListener(new MyListener());
        checkout.setOnClickListener(new MyListener());
        baggagecollection.setOnClickListener(new MyListener());


    }

    public void openRoomServiceMenu() {
        Intent intent = new Intent(this, RoomServiceMenu.class);
        startActivity(intent);
    }

}
