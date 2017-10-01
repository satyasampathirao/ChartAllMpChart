package com.satman.satya.chartallmpchart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EntranceActivity extends AppCompatActivity {


    // this example is helpfull - if u want to integrate all charts in one example
    // if u want one particular chart, then go to new and search for that chart.
    // various charts are collected from various examples.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrance);
    }



    public void btbarchart(View view){

        startActivity(new Intent(getApplicationContext(),NewBarChartActivity.class));

    }


    public void btpiechart(View view){

        startActivity(new Intent(getApplicationContext(),PieChartActivity.class));

    }

    public void btlinechart(View view){

        startActivity(new Intent(getApplicationContext(),LineChartActivity.class));

    }


    public void bthorizonchart(View view){

        startActivity(new Intent(getApplicationContext(),HorizontalBarChartActivity.class));


    }

    //


    public void btppiechart2(View view){

        startActivity(new Intent(getApplicationContext(),PieChart2Activity.class));


    }



}
