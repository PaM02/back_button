package com.codinginflow.backbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        getSupportActionBar().setTitle("Activity 2");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

       Button button2 =  findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Activity3.class);
                startActivity(intent);
            }
        });
    }

}
