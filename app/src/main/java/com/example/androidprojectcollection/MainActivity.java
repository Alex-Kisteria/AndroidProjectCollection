package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLayoutExercise;
    Button btnButtonExercise;
    Button btnCalculator;

    Button btnMatch3;
    Button btnMenu;
    Button btnOpeningMaps;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLayoutExercise = (Button) findViewById(R.id.btnLayoutExercise);
        btnLayoutExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent constructor can receive this Activity and destination Activity/class
                //an intent is a gateway from  activity to the next
                Intent intent1 = new Intent(
                        MainActivity.this, LayoutExercise.class
                );

                startActivity(intent1);
                finish(); //para di mag lag ang cp and ma end ang task inig back
            }
        });

        btnButtonExercise = (Button) findViewById(R.id.btnButtonExercise);
        btnButtonExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, ButtonExercise.class);
                startActivity(intent2);
                finish();
            }
        });

        btnCalculator = (Button) findViewById((R.id.btnCalculator));
        btnCalculator.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, Calculator.class);
                startActivity(intent3);
                finish();
            }
        }));

        btnMatch3 = (Button) findViewById(R.id.btnMatch3);
        btnMatch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this, match3.class);
                startActivity(intent4);
                finish();
            }
        });


        btnMenu = (Button) findViewById(R.id.btnmain_menus);
        btnMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view) {
                Intent intent7 = new Intent(MainActivity.this, MenuExercise.class);
                startActivity(intent7);
                finish();
            }
        });

        btnOpeningMaps = (Button) findViewById(R.id.btnOpeningMaps);
        btnOpeningMaps.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent8 = new Intent(MainActivity.this, MapsExercise.class);
                startActivity(intent8);
                finish();
            }
        });




    }

}