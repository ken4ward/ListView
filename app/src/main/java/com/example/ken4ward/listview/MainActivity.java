package com.example.ken4ward.listview;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ListAdapter;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] foods = {"Stanley", "John", "Peace", "Glory", "Amen"};
       // ListAdapter bukkyAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, foods);
        ListAdapter bukkyAdapter = new CustomAdapter(this,foods);
        ListView bukkyListView = (ListView)findViewById(R.id.bukkyListViewPane);
        bukkyListView.setAdapter(bukkyAdapter);

        bukkyListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String food = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(MainActivity.this, food, Toast.LENGTH_LONG).show();
            }
        });

    }
}
