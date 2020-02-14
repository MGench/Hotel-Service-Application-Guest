package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TvChannelMenu extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv_channel_menu);
        getSupportActionBar().setTitle("TvChannel Menu");

        Button button4 = findViewById(R.id.button4);

        button4.setOnClickListener(this);

    }

        @Override
        public void onClick (View v) {
            switch (v.getId()) {
                case R.id.button4:
                    Toast.makeText(this, "Selected genres confirmed.", Toast.LENGTH_SHORT ).show();
                    break;

            }
        }
}
