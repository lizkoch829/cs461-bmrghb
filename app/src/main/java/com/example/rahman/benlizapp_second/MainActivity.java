package com.example.rahman.benlizapp_second;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final String[] teamArray = {"Arizona Cardinals",
            "Atlanta Falcons",
            "Baltimore Ravens",
            "Buffalo Bills",
            "Carolina Panthers",
            "Chicago Bears",
            "Cincinnati Bengals",
            "Cleveland Browns",
            "Dallas Cowboys",
            "Denver Broncos",
            "Detroit Lions",
            "Green Bay Packers",
            "Houston Texans",
            "Indianapolis Colts",
            "Jacksonville Jaguars",
            "Kansas City Chiefs",
            "Los Angeles Chargers",
            "Los Angeles Rams",
            "Miami Dolphins",
            "Minnesota Vikings",
            "New England Patriots",
            "Ne Orleans Saints",
            "New York Giants",
            "New York Jets",
            "Oakland Raiders",
            "Philadelphia Eagles",
            "Pittsburgh Steelers",
            "San Francisco 49ers",
            "Seattle Seahawks",
            "Tampa Bay Buccaneers",
            "Tennessee Titans",
            "Washington Redskins"};
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create List Adapter instance, and feed data arrays to it.
        CustomListAdapter teamListAdapter = new CustomListAdapter(this, teamArray);

        // Set Adapter for ListView
        listView = (ListView) findViewById(R.id.teamsListViewID);
        listView.setAdapter(teamListAdapter);

        // Set Listener for Row (Team) Selection
        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, CalculatorActivity.class);
                String test_message = teamArray[position]; //TEST STRING!!!!
                intent.putExtra("this_team_string", test_message); //Pass string to Calculator Activity Java Class
                startActivity(intent); //Start Calculator Activity
                Toast toast = Toast.makeText(getApplicationContext(), test_message,Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }
}
