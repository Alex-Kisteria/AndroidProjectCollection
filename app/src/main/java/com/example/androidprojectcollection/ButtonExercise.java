package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonExercise extends AppCompatActivity {
    boolean isBackgroundChanged = false;
    boolean isButtonBackgroundChanged = false;

    Button btnOpenEmptyActivity;
    Button btnToast;

    Button btnChangeBg;
    Button btnChangeButtonBg;
    Button btnDisappear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_exercise);
        getWindow().setBackgroundDrawableResource(R.color.white);





        btnOpenEmptyActivity = (Button) findViewById(R.id.btnOpenEmptyActivity);
        btnOpenEmptyActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ButtonExercise.this, EmptyActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnToast = (Button) findViewById(R.id.btnToast);
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                String text = "Toast!!!";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        btnChangeBg = (Button) findViewById(R.id.btnChangeBg);
        btnChangeBg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isBackgroundChanged){
                    getWindow().setBackgroundDrawableResource(R.color.white);
                } else {
                    getWindow().setBackgroundDrawableResource(R.color.teal_700);
                }
                isBackgroundChanged = !isBackgroundChanged;
            }
        });

        btnChangeButtonBg = (Button) findViewById(R.id.btnChangeButtonBg);
        btnChangeButtonBg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isButtonBackgroundChanged){
                    btnChangeButtonBg.setBackgroundColor(Color.MAGENTA);
                } else {
                    btnChangeButtonBg.setBackgroundColor(Color.DKGRAY);
                }
                isButtonBackgroundChanged = !isButtonBackgroundChanged;

            }
        });

        btnDisappear = (Button) findViewById(R.id.btnDisappear);
        btnDisappear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnDisappear.setVisibility(View.INVISIBLE);
            }
        });



    }
}