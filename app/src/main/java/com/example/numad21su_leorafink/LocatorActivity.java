package com.example.numad21su_leorafink;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LocatorActivity extends AppCompatActivity {
    Button locatorButton;
    TextView longitude;
    TextView latitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locatorpage);

        locatorButton = findViewById(R.id.button5);
        latitude = findViewById(R.id.latitude);
        longitude = findViewById(R.id.longitude);




    }


}
