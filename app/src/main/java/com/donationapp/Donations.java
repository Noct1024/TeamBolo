package com.donationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Donations extends AppCompatActivity {
    private EditText DoNname, DoNcity, disaster, date,Ngoods;
    private Button SubmitDon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donations);

        DoNname = findViewById(R.id.needName);
        DoNcity = findViewById(R.id.DoNcity);
        Ngoods = findViewById(R.id.NeedGoods);
        date = findViewById(R.id.Dodate);
        disaster = findViewById(R.id.disaster);

        SubmitDon = findViewById(R.id.Submit);
        SubmitDon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name, city, quan, goods;
                name =DoNname.getText().toString();
                city =DoNcity.getText().toString();

                showMessage("thanks for you answer");
            }
        });
    }

    private boolean isValid(String name, String city, String goods, String date, String quantity) {
        List<String> valid_donations = new ArrayList<>();
        valid_donations.add("Beddings");
        valid_donations.add("Money");
        valid_donations.add("Clothes");
        valid_donations.add("Food");

        if (name.isEmpty()){
            showMessage("name is required");
            return false;
        } else if (city.isEmpty()) {
            showMessage("city is required");
            return false;
        }
        return false;
    }

    private void  showMessage(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show ();


    }
}

