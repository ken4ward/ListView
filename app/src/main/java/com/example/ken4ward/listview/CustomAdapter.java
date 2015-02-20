package com.example.ken4ward.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String>{

    CustomAdapter(Context context, String[] food)
    {
        super(context, R.layout.custom_row, food);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater bukkyInflater = LayoutInflater.from(getContext());
        View customView = bukkyInflater.inflate(R.layout.custom_row, parent, false);
        String getItemPosition = getItem(position);
        TextView bukkyText = (TextView)customView.findViewById(R.id.bukkyText);
        ImageView bukkyImage = (ImageView)customView.findViewById(R.id.bukkyimage);

        bukkyText.setText(getItemPosition);
        bukkyImage.setImageResource(R.drawable.kehindeadeoya);
        return customView;
    }

}
