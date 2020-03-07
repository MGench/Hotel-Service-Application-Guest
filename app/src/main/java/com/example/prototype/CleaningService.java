package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CleaningService extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cleaning_service);
        getSupportActionBar().setTitle("Cleaning Service");

        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.button5:
                Toast.makeText(this, "Message sent succesfully", Toast.LENGTH_SHORT ).show();
                break;

        }
    }


    public void sendMessage(View v)
    {
        String message;
        message = ((TextView)v).getText().toString();
        Intent i = new Intent();
        i.setAction(Intent.ACTION_SEND);
        i.putExtra(Intent.EXTRA_TEXT, message);
        i.setType("text/plain");
        startActivity(i);
    }
}
