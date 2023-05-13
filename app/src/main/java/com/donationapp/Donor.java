package com.donationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Donor extends AppCompatActivity {
    private EditText Doname, Docity, quantity, goods;
    private Button SubmitDon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor);

        Doname = findViewById(R.id.Doname);
        Docity = findViewById(R.id.DoCity);
        quantity = findViewById(R.id.quantity);
        SubmitDon = findViewById(R.id.SubmitDon);
        SubmitDon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name, city, quan, goods;
                name =Doname.getText().toString();
               city =Docity.getText().toString();
               quan =quantity.getText().toString();
               goods =quantity.getText().toString();

               message(name+"\n"+city+"\n"+quan+"\n"+goods+"\n");
            }
        });
    }
    private void  message(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show ();
    }
}