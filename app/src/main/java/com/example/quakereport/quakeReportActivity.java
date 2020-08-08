package com.example.quakereport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class quakeReportActivity extends AppCompatActivity {
    public static final String LOG_TAG = quakeReportActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<earthQuake> earthquakes = QueryUtils.extractEarthquakes();
        // List view layout
        ListView earthQuakeListView = (ListView) findViewById(R.id.listView);
        earthQuakeAdapter Adapter = new earthQuakeAdapter(this , R.layout.layout , earthquakes);
        earthQuakeListView.setAdapter(Adapter);

    }

}