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
public CheckBox FirstCheckBox, SecondCheckBox, ThirdCheckBox, FourthCheckBox, FifthCheckBox, SixthCheckBox, SeventhCheckBox;
DatabaseReference reff;

private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toiletries_menu);
        getSupportActionBar().setTitle("Toiletries");

        FirstCheckBox = findViewById(R.id.cb1);
        SecondCheckBox = findViewById(R.id.cb2);
        ThirdCheckBox = findViewById(R.id.cb3);
        FourthCheckBox = findViewById(R.id.cb4);
        FifthCheckBox = findViewById(R.id.cb5);
        SixthCheckBox = findViewById(R.id.cb6);
        SeventhCheckBox = findViewById(R.id.cb7);

        button3 = (Button) findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseReference guest_db = reff.child("guest1");

                if(FirstCheckBox.isChecked()) {
                    guest_db.child("request").setValue("Toiletpaper");
                }

                if(SecondCheckBox.isChecked()) {
                    guest_db.child("request").setValue("Toothbrush");
                }

                if(ThirdCheckBox.isChecked()) {
                    guest_db.child("request").setValue("Toothpaste");
                }
                if(FourthCheckBox.isChecked()) {
                    guest_db.child("request").setValue("Handwash");
                }

                if(FifthCheckBox.isChecked()) {
                    guest_db.child("request").setValue("Shampoo");
                }

                if(SixthCheckBox.isChecked()) {
                    guest_db.child("request").setValue("Moisturiser");
                }

                if(SeventhCheckBox.isChecked()) {
                    guest_db.child("request").setValue("Towels");
                }

                Toast.makeText(ToiletriesMenu.this, "You have successfully requested your toiletries.", Toast.LENGTH_LONG).show();


            }
        });

        reff = FirebaseDatabase.getInstance().getReference().child("Guest");

    }
}
