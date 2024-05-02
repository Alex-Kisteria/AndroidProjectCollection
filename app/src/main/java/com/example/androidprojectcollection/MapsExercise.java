package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MapsExercise extends AppCompatActivity {
ImageButton btncharlie;
ImageButton btnmind;
ImageButton btnleophold;
ImageButton btnmtPulag;
ImageButton btnlego;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_exercise);

        btncharlie = (ImageButton) findViewById(R.id.ibcharliescup);
        btncharlie.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent Icharlie = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:10.41978800140344, 123.7984212168032"));
                startActivity(Icharlie);
            }
        });

        btnmind = (ImageButton) findViewById(R.id.ibMind);
        btnmind.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent Imind = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:14.552395765701863, 121.04565177031641"));
                startActivity(Imind);
            }
        });

        btnleophold = (ImageButton) findViewById(R.id.ibLeophold);
        btnleophold.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent Ileophold = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:47.789235, 13.038361"));
                startActivity(Ileophold);
            }
        });

        btnmtPulag = (ImageButton) findViewById(R.id.ibPulag);
        btnmtPulag.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent Ipulag = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:16.597559102448354, 120.89917353942606"));
                startActivity(Ipulag);
            }
        });

        btnlego = (ImageButton) findViewById(R.id.ibLego);
        btnlego.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent Ilego = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:1.4272927953154377, 103.62951310982098"));
                startActivity(Ilego);
            }
        });
    }
}