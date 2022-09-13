package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //TEAM A -----------------------------------------------------------------------/
    int teamAScore = 0;

    public void threePointsA(View view)
    {
        teamAScore+=3;
        teamAPoints(teamAScore);
    }

    public void twoPointsA(View view)
    {
        teamAScore+=2;
        teamAPoints(teamAScore);
    }

    public void onePointsA(View view)
    {
        teamAScore+=1;
        teamAPoints(teamAScore);
    }

    public void teamAPoints(int score)
    {
        TextView points = (TextView) findViewById(R.id.points_A);
        points.setText(String.valueOf(score));
    }

    public void resetA(View view)
    {
        teamAScore = 0;
        teamAPoints(0);
    }

    //TEAM B -----------------------------------------------------------------------/
    int teamBScore = 0;

    public void threePointsB(View view)
    {
        teamBScore+=3;
        teamBPoints(teamBScore);
    }

    public void twoPointsB(View view)
    {
        teamBScore+=2;
        teamBPoints(teamBScore);
    }

    public void onePointsB(View view)
    {
        teamBScore+=1;
        teamBPoints(teamBScore);
    }

    public void teamBPoints(int score)
    {
        TextView points = (TextView) findViewById(R.id.points_B);
        points.setText(String.valueOf(score));
    }

    public void resetB(View view)
    {
        teamBScore = 0;
        teamBPoints(0);
    }
}