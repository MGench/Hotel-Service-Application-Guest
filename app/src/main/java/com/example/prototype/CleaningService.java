package com.example.prototype;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CleaningService extends AppCompatActivity {

    EditText serviceRequest;
    Button sendButton;
    DatabaseReference reff;
    Guest guest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cleaning_service);
        getSupportActionBar().setTitle("Cleaning Service");
        serviceRequest=(EditText)findViewById(R.id.serviceRequest);
        sendButton=(Button)findViewById(R.id.sendButton);
        guest = new Guest();
        reff= FirebaseDatabase.getInstance().getReference().child("Guest");

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick (View view) {

                guest.setRequest(serviceRequest.getText().toString().trim());

                reff.child("guest1").setValue(guest);
               Toast.makeText(CleaningService.this, "Message sent successfully.", Toast.LENGTH_LONG).show();
            }
       });

        reff.child("guest1").setValue(guest).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()){
                    Toast.makeText(CleaningService.this, "Success" , Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(CleaningService.this, "Error: " + task.getException().getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });

    }

}
