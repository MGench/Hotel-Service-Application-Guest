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

        transportation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainMenu.this, "This action is unavailable", Toast.LENGTH_LONG).show();
            }
        });

        foodservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainMenu.this, "This action is unavailable", Toast.LENGTH_LONG).show();
            }
        });

        maintenance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainMenu.this, "This action is unavailable", Toast.LENGTH_LONG).show();
            }
        });

        checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainMenu.this, "This action is unavailable", Toast.LENGTH_LONG).show();
            }
        });

        baggagecollection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainMenu.this, "This action is unavailable", Toast.LENGTH_LONG).show();
            }
        });

    }

    public void openRoomServiceMenu() {
        Intent intent = new Intent(this, RoomServiceMenu.class);
        startActivity(intent);
    }

}
