package com.satman.satya.chartallmpchart;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class PieChart2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart2);


        PieChart mChart = (PieChart) findViewById(R.id.piechart2);
        mChart.setUsePercentValues(true);

        // IMPORTANT: In a PieChart, no values (Entry) should have the same
        // xIndex (even if from different DataSets), since no values can be
        // drawn above each other.
        ArrayList<Entry> yvalues = new ArrayList<Entry>();



        yvalues.add(new Entry(19f, 0));
        yvalues.add(new Entry(12f, 1));
        yvalues.add(new Entry(0f, 2));


        PieDataSet dataSet = new PieDataSet(yvalues, "Election Results");


        ArrayList<String> xVals = new ArrayList<String>();

        xVals.add("YES");
        xVals.add("NO");
        xVals.add("MAYBE");


        PieData data = new PieData(xVals, dataSet);
        data.setValueFormatter(new PercentFormatter());
        mChart.setData(data);
        mChart.setDescription("This is Pie Chart");

        mChart.setDrawHoleEnabled(true);
        mChart.setHoleColor(Color.WHITE);
        mChart.setTransparentCircleRadius(25f);
        mChart.setHoleRadius(25f);

        /*mChart.setHoleRadius(58f);
        mChart.setTransparentCircleRadius(61f);*/

        dataSet.setColors(ColorTemplate.VORDIPLOM_COLORS);
        data.setValueTextSize(13f);
        data.setValueTextColor(Color.DKGRAY);
  //      mChart.setOnChartValueSelectedListener(this);

        mChart.animateXY(1400, 1400);




        //   mChart.getDescription().setEnabled(false);
        mChart.setExtraOffsets(5, 10, 5, 5);

        mChart.setDragDecelerationFrictionCoef(0.95f);

        //  tf = Typeface.createFromAsset(getAssets(), "OpenSans-Regular.ttf");

        //  mChart.setCenterTextTypeface(Typeface.createFromAsset(getAssets(), "OpenSans-Light.ttf"));
        //  mChart.setCenterText(generateCenterSpannableText());

        mChart.setExtraOffsets(20.f, 0.f, 20.f, 0.f);




        mChart.setTransparentCircleColor(Color.WHITE);
        mChart.setTransparentCircleAlpha(110);



        mChart.setDrawCenterText(true);

        mChart.setRotationAngle(0);
        // enable rotation of the chart by touch
        mChart.setRotationEnabled(true);
        mChart.setHighlightPerTapEnabled(true);

        // mChart.setUnit(" €");
        // mChart.setDrawUnitsInChart(true);

        // add a selection listener
 //       mChart.setOnChartValueSelectedListener(this);

        //  setData(4, 100);

        mChart.animateY(1400, Easing.EasingOption.EaseInOutQuad);




    }



}
