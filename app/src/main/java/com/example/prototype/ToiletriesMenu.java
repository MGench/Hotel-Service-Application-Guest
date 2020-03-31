package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ToiletriesMenu extends AppCompatActivity {
public CheckBox toiletpaper, toothbrush, toothPaste, handwash, shampoo, moisturiser, towels;
DatabaseReference reff;

private Button confirmButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toiletries_menu);
        getSupportActionBar().setTitle("Toiletries");

        toiletpaper = findViewById(R.id.cb1);
        toothbrush = findViewById(R.id.cb2);
        toothPaste = findViewById(R.id.cb3);
        handwash = findViewById(R.id.cb4);
        shampoo = findViewById(R.id.cb5);
        moisturiser = findViewById(R.id.cb6);
        towels = findViewById(R.id.cb7);

        confirmButton = (Button) findViewById(R.id.confirmButton);

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseReference guest_db = reff.child("guest1");

                if(toiletpaper.isChecked()) {
                    guest_db.child("request").setValue("Toiletpaper");
                }

                if(toothbrush.isChecked()) {
                    guest_db.child("request").setValue("Toothbrush");
                }

                if(toothPaste.isChecked()) {
                    guest_db.child("request").setValue("Toothpaste");
                }
                if(handwash.isChecked()) {
                    guest_db.child("request").setValue("Handwash");
                }

                if(shampoo.isChecked()) {
                    guest_db.child("request").setValue("Shampoo");
                }

                if(moisturiser.isChecked()) {
                    guest_db.child("request").setValue("Moisturiser");
                }

                if(towels.isChecked()) {
                    guest_db.child("request").setValue("Towels");
                }

                Toast.makeText(ToiletriesMenu.this, "You have successfully requested your toiletries.", Toast.LENGTH_LONG).show();


            }
        });

        reff = FirebaseDatabase.getInstance().getReference().child("Guest");

    }
}
