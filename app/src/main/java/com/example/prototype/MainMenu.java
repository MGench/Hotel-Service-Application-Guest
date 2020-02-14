package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainMenu extends AppCompatActivity {

    private ImageButton roomservice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        getSupportActionBar().setTitle("MainMenu");

        roomservice = (ImageButton) findViewById(R.id.roomservice);
        roomservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRoomServiceMenu(); // creates main menu method name
            }
        });
    }

    public void openRoomServiceMenu() {
        Intent intent = new Intent(this, RoomServiceMenu.class);
        startActivity(intent);
    }
}
