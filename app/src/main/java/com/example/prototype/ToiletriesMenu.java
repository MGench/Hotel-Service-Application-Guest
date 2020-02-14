package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ToiletriesMenu extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toiletries_menu);
        getSupportActionBar().setTitle("Toiletries");

        Button button3 = findViewById(R.id.button3);

        button3.setOnClickListener(this);

    }

    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.button3:
                Toast.makeText(this, "You have succesfully requested your toiletries.", Toast.LENGTH_SHORT ).show();
                break;

        }
    }
}
