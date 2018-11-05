package com.example.rahman.benlizapp_second;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomTableAdapter extends ArrayAdapter {
    private final Activity context;
    private final String[] rosterArray;

    public CustomTableAdapter(Activity context, String[] rosterArrayParam){
        super(context, R.layout.roster_row, rosterArrayParam);
        this.context = context;
        this.rosterArray = rosterArrayParam;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.roster_row, null, true);

        // Get Row's TextView Refs
        TextView nameTV = (TextView) rowView.findViewById(R.id.name_textView);
        TextView positionTV = (TextView) rowView.findViewById(R.id.position_textView);
        TextView accruedSeasonsTV = (TextView) rowView.findViewById(R.id.accruedSeasons_textView);
        TextView baseSalaryTV = (TextView) rowView.findViewById(R.id.baseSalary_textView);
        TextView bonusTV = (TextView) rowView.findViewById(R.id.bonus_textView);
        TextView capNumberTV = (TextView) rowView.findViewById(R.id.capNumber_textView);

        // Dummy Values
        nameTV.setText("Name");
        positionTV.setText("Pos");
        accruedSeasonsTV.setText("AS");
        baseSalaryTV.setText("Base Salary");
        bonusTV.setText("Bonuses");
        capNumberTV.setText("Cap Number");

        return rowView;
    }
}
