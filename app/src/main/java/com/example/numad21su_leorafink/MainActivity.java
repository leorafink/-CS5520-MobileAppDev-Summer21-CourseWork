package com.example.numad21su_leorafink;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayInfo(View view) {
        //EditText dollarText = findViewById(R.id.dollarText);
        TextView textView2 = findViewById(R.id.textView2);
       // if (!dollarText.getText().toString().equals("")) {
       //     Float dollarValue = Float.valueOf(dollarText.getText().toString());
      //      Float euroValue = dollarValue * 0.85F;
            textView2.setText("Leora Fink\nfink.le@northeastern.edu");
       // } else {
       //     textView.setText(R.string.no_value_string);
      //  }
    }

}