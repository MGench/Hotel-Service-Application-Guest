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

    public CheckBox EighthCheckBox, NinthCheckBox, TenthCheckBox, EleventhCheckBox;
    DatabaseReference reff;

    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv_channel_menu);
        getSupportActionBar().setTitle("Tv Channel Menu");

        EighthCheckBox = findViewById(R.id.cb8);
        NinthCheckBox = findViewById(R.id.cb9);
        TenthCheckBox = findViewById(R.id.cb10);
        EleventhCheckBox = findViewById(R.id.cb11);

        button4 = (Button) findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseReference guest_db = reff.child("guest1");

                if(EighthCheckBox.isChecked()) {
                    guest_db.child("request").setValue("Documentary");
                }

                if(NinthCheckBox.isChecked()) {
                    guest_db.child("request").setValue("Horror");
                }

                if(TenthCheckBox.isChecked()) {
                    guest_db.child("request").setValue("Kids");
                }
                if(EleventhCheckBox.isChecked()) {
                    guest_db.child("request").setValue("Sports");
                }


                Toast.makeText(TvChannelMenu.this, "You have successfully confirmed the genre.", Toast.LENGTH_LONG).show();


            }
        });

        reff = FirebaseDatabase.getInstance().getReference().child("Guest");

    }
}
