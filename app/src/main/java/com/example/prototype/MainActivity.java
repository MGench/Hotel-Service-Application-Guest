package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainMenu(); // creates main menu method name
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAdminMenu(); // creates main menu method name
            }
        });
    }

    public void openMainMenu() { //method created for main menu
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }

    public void openAdminMenu() { //method created for main menu
        Intent intent = new Intent(this, AdminMenu.class);
        startActivity(intent);
    }
}