package com.usefi.showseasonsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

LinearLayout jan, feb, mar, apr, may;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         jan = findViewById(R.id.jan);
         feb = findViewById(R.id.feb);
         mar = findViewById(R.id.mar);
         apr = findViewById(R.id.apr);
         may = findViewById(R.id.may);

        jan.setOnClickListener(this);
        feb.setOnClickListener(this);
        mar.setOnClickListener(this);
        apr.setOnClickListener(this);
        may.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == jan)
            Toast.makeText(MainActivity.this, "January", Toast.LENGTH_SHORT).show();
        if (view == feb )
            Toast.makeText(MainActivity.this, "February", Toast.LENGTH_SHORT).show();
        if (view == mar)
            Toast.makeText(MainActivity.this, "March", Toast.LENGTH_SHORT).show();
        if (view == apr )
            Toast.makeText(MainActivity.this, "April", Toast.LENGTH_SHORT).show();
        if (view == may )
            Toast.makeText(MainActivity.this, "May", Toast.LENGTH_SHORT).show();
    }
}
