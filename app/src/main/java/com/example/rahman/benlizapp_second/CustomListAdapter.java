package com.example.rahman.benlizapp_second;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter {
    private final Activity context; // Get Reference to Main Activity
    private final String[] teamArray;

    public CustomListAdapter(Activity context, String[] teamArrayParam){
        super(context, R.layout.listview_team_row, teamArrayParam);

        // Set
        this.context = context;
        this.teamArray = teamArrayParam;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.listview_team_row, null, true);

        TextView teamsTextField = (TextView) rowView.findViewById(R.id.textview_team_row);

        teamsTextField.setText(teamArray[position]);

        return rowView;
    }
}
