package com.donationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.transform.ErrorListener;

import VoleySingleton.VolleySingleton;


public class Donor extends AppCompatActivity {
    private EditText Doname, Docity, quantity, date,goods;
    private Button SubmitDon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor);

        Doname = findViewById(R.id.Doname);
        Docity = findViewById(R.id.DoCity);
        quantity = findViewById(R.id.quantity);
        goods = findViewById(R.id.doGoods);


        SubmitDon = findViewById(R.id.SubmitDon);
        SubmitDon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name, city, quan, goods;
                name =Doname.getText().toString();
               city =Docity.getText().toString();
               quan =quantity.getText().toString();
               goods =quantity.getText().toString();

               showMessage("thanks for donating");
            }
        });
    }

    private  void register(String name, String city,String quantity){
        StringRequest stringRequest = new StringRequest(Request.Method.POST, "", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if (response.equals("success")) {
                    Toast.makeText(Donor.this, response, Toast.LENGTH_SHORT).show();
                    Donor.this.finish();
                }


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError{
                return super.getParams();
            }
        };
        VolleySingleton.getInstance(this). addToRequestQueue(stringRequest);

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
        } else if (goods.isEmpty()) {
            showMessage("goods is empty");
            return false;
        } else if (date.isEmpty()) {
            showMessage("date is empty");
            return false;
        }
        return false;
    }

    private void  showMessage(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show ();
    }
}