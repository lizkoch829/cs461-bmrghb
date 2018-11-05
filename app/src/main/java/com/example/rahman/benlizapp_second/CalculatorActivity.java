package com.example.rahman.benlizapp_second;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.HorizontalScrollView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CalculatorActivity extends AppCompatActivity {

    private String[] rosterArray = {"Player1","Player2","Player3","Player4","Player5","Player6","Player7"};
    private static final String LOGTAG = "CALCULATOR-ACTIVITY";// LogCat Debug Tag

    private ListView tableRow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        // Create Adapter and Use to Generate and Inflate Table
        CustomTableAdapter rosterTableAdapter = new CustomTableAdapter(this, rosterArray);

        tableRow = (ListView) findViewById(R.id.roster_listView);
        tableRow.setAdapter(rosterTableAdapter);

        // Receive Passed Extra from previous activity, Create TextView Ref, assign it the Extra.
        String savedExtra = getIntent().getStringExtra("this_team_string");
        TextView myText = (TextView) findViewById(R.id.team_calculator_textView);

        String header = savedExtra + " Cap Calculator:";
        myText.setText(header);

        //STUB: Add DB retrieval, and player array assignment code here
    }
}