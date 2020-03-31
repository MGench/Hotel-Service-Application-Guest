package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class TvChannelMenu extends AppCompatActivity {

    public CheckBox documentary, horror, kids, sports;
    DatabaseReference reff;

    private Button confirmButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv_channel_menu);
        getSupportActionBar().setTitle("Tv Channel Menu");

        documentary = findViewById(R.id.cb8);
        horror = findViewById(R.id.cb9);
        kids = findViewById(R.id.cb10);
        sports = findViewById(R.id.cb11);

        confirmButton = (Button) findViewById(R.id.confirmButton);

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseReference guest_db = reff.child("guest1");

                if(documentary.isChecked()) {
                    guest_db.child("request").setValue("Documentary");
                }

                if(horror.isChecked()) {
                    guest_db.child("request").setValue("Horror");
                }

                if(kids.isChecked()) {
                    guest_db.child("request").setValue("Kids");
                }
                if(sports.isChecked()) {
                    guest_db.child("request").setValue("Sports");
                }


                Toast.makeText(TvChannelMenu.this, "You have successfully confirmed the genre.", Toast.LENGTH_LONG).show();


            }
        });

        reff = FirebaseDatabase.getInstance().getReference().child("Guest");

    }
}
