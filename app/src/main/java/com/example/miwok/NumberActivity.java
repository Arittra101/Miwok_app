package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);


        ArrayList<Word> frnd = new ArrayList<Word>();
        frnd.add(new Word("Debopriya Roy","65"));
        frnd.add(new Word("Tashfia Hossain","78"));
        frnd.add(new Word("Rabeya Islma Momo","76"));
        frnd.add(new Word("Oindrila Saha","100"));
        frnd.add(new Word("SwarnaJit Saha","86"));
        frnd.add(new Word("Jobairul Hasan","88"));
        frnd.add(new Word("Tashfia Towhid","85"));
        frnd.add(new Word("Pronay Debnath Anik","96"));
        frnd.add(new Word("Rifa","97"));
        frnd.add(new Word("Mukaffi","77"));
        frnd.add(new Word("Rashik Mahmud","89"));
        frnd.add(new Word("Togor","90"));
        frnd.add(new Word("Arittra Das","83"));
        frnd.add(new Word("Saba","91"));
        frnd.add(new Word("Rasel","93"));




        //LinearLayout rootView = (LinearLayout)findViewById(R.id.linear);
        //TextView frndWord=null;



//        ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,frnd);
        customAdapter c_AP =  new customAdapter(this,frnd);
        ListView LV = (ListView)findViewById(R.id.list);
        LV.setAdapter(c_AP);

//         Log.v("NumberActivy",frnd.get(0).getName());
        System.out.println(frnd.get(0).getName());
//        for(int i=0;i<frnd.size();i++)
//        {
//            frndWord =  new TextView(this);
//            frndWord.setText(frnd.get(i));
//            rootView.addView(frndWord);
//
//        }


    }
}