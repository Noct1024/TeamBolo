package com.donationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button donor;
    private Button dononate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        donor = (Button) findViewById(R.id.donor);
        donor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDonorpage();

            }
        });
    }

    public void openDonorpage() {
        Intent intent = new Intent(this, Donor.class);
        startActivity(intent);
    }
}