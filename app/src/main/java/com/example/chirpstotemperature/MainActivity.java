package com.example.chirpstotemperature;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etChirps;
    Button btnSubmit;
    TextView tvResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etChirps = findViewById(R.id.etChirps);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvResults = findViewById(R.id.tvResults);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etChirps.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Please enter number of chirps", Toast.LENGTH_SHORT).show();
                }
                else{
                    double temperature = (Double.parseDouble(etChirps.getText().toString())/3) + 4;
                    String finalTemperature = getString(R.string.Result_text) + " " + Double.toString(temperature) + getString(R.string.degree_symbol)+ getString(R.string.Celcius);

                    tvResults.setText( finalTemperature);
                }
            }
        });
    }
}