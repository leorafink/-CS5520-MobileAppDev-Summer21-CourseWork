package com.example.numad21su_leorafink;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayInfo(View view) {

        TextView textView2 = findViewById(R.id.textView2);

        textView2.setText("Leora Fink\nfink.le@northeastern.edu");

    }
    public void nextActivity(View view){
        //setContentView(R.layout.contentbuttons);
        Intent buttonIntent = new Intent(this, ButtonActivity.class);
        startActivity(buttonIntent);
    }

    public void linkCollectorPage(View view){
        Intent intentClick = new Intent(this, RecycleActivity.class);
        startActivity(intentClick);
    }

    public void locatorPage(View view){
        Intent intentClick = new Intent(this, LocatorActivity.class);
        startActivity(intentClick);
    }

    public void webServicePage(View view) {
        Intent intentClick = new Intent(this, WebServiceActivity.class);
        startActivity(intentClick);
    }

}