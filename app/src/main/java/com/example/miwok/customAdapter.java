package com.example.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class customAdapter extends ArrayAdapter<Word> {

   public customAdapter(Context context, ArrayList<Word>words)
   {
       super(context,0, words);
   }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Word currentWord = getItem(position);
        if(convertView==null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_layout,parent,false);
        }

        TextView name = (TextView) convertView.findViewById(R.id.name);
        name.setText("Name: "+currentWord.getName());
        TextView id = (TextView) convertView.findViewById(R.id.id);
        id.setText("ID: "+currentWord.getId());
        return convertView;
    }
}
