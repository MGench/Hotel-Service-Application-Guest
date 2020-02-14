package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class RoomServiceMenu extends AppCompatActivity {

    private ImageButton toiletries;
    private ImageButton tvchannel;
    private ImageButton cleaning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_service_menu);
        getSupportActionBar().setTitle("Roomservice");


            toiletries = (ImageButton) findViewById(R.id.toiletries);
            toiletries.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openToiletriesMenu(); // creates main menu method name
                }
            });

        tvchannel = (ImageButton) findViewById(R.id.tvchannel);
        tvchannel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTvChannelMenu(); // creates main menu method name
            }
        });

        cleaning = (ImageButton) findViewById(R.id.cleaning);
        cleaning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCleaningService();
            }
        });

        }
    public void openCleaningService() {
        Intent intent = new Intent(this, CleaningService.class);
        startActivity(intent);

        }

        public void openToiletriesMenu() {
            Intent intent = new Intent(this, ToiletriesMenu.class);
            startActivity(intent);
        }

    public void openTvChannelMenu() {
        Intent intent = new Intent(this, TvChannelMenu.class);
        startActivity(intent);
    }
}
