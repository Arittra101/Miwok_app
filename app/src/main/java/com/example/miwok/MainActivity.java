package com.example.miwok;

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

        TextView family_view =  findViewById(R.id.family);
        family_view.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                family_call();

            }
        });
    }

    public void family_call()
    {
        Intent i = new Intent(this,FamilyActivity.class);
        startActivity(i);
    }
    public void number(View view)
    {
//        Intent i = new Intent(this,NumberActivity.class);
        Intent i =new Intent(this,NumberActivity.class);
        startActivity(i);
    }
}