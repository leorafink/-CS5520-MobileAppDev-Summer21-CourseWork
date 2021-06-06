package com.example.numad21su_leorafink;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ButtonActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contentbuttons);

    }

    public void displayPressedA(View view) {
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText("Pressed: A");
    }
    public void displayPressedB(View view) {
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText("Pressed: B");
    }
    public void displayPressedC(View view) {
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText("Pressed: C");
    }
    public void displayPressedD(View view) {
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText("Pressed: D");
    }
    public void displayPressedE(View view) {
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText("Pressed: E");
    }
    public void displayPressedF(View view) {
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText("Pressed: F");
    }
}
