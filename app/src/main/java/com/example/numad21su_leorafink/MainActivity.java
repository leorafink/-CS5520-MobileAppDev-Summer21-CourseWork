package com.example.numad21su_leorafink;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

  /*      init(savedInstanceState);

        addButton = findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: ADD POP_UP WINDOW HERE
              //  LayoutInflater layoutInflater = LayoutInflater.from(Context context);

                int pos = 0;   //HEREEEEEEEEEE
                addItem(pos);  //HEREEEEEE
            }
        });

        //Specify what action a specific gesture performs, in this case swiping right or left deletes the entry
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
                Toast.makeText(MainActivity.this, "Delete an item", Toast.LENGTH_SHORT).show();
                int position = viewHolder.getLayoutPosition();
                itemList.remove(position);

                rviewAdapter.notifyItemRemoved(position);

            }
        });
        itemTouchHelper.attachToRecyclerView(recyclerView);*/
    }

    public void displayInfo(View view) {

        TextView textView2 = findViewById(R.id.textView2);

        textView2.setText("Leora Fink\nfink.le@northeastern.edu");

    }
    public void nextActivity(View view){
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

    public void linkCollectorPage(View view){
        Intent intentClick = new Intent(this, RecycleActivity.class);
        startActivity(intentClick);
       // setContentView(R.layout.linkcollector);

    }

}