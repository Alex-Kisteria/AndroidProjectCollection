package com.example.androidprojectcollection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MenuExercise extends AppCompatActivity {

    Button btnChanger;
    TextView menuTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_exercise);

        btnChanger = findViewById(R.id.btnTransformingButton);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.choice_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        if(item.getItemId() == R.id.mItemChange)
        {
            Toast.makeText(this,"Edit Object Item is clicked", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.mItemText) {
            //display a text in the button
            btnChanger.setTextColor(Color.WHITE);
            btnChanger.setText("Omyyy a text!!!");

            return true;
        } else if (item.getItemId() == R.id.mItemColor) {
            Toast.makeText(this,"Background Color Changed", Toast.LENGTH_SHORT).show();
            //change BG Color
            btnChanger.setBackgroundColor(Color.parseColor("#000080"));
            return true;
        } else if (item.getItemId() == R.id.mItemSize) {
            Toast.makeText(this,"Button Size Changed", Toast.LENGTH_SHORT).show();
            //change button size to 2x bigger
            ViewGroup.LayoutParams params = btnChanger.getLayoutParams();
            params.width = params.width * 2; // Double the width
            params.height = params.height * 2; // Double the height
            btnChanger.setLayoutParams(params);
            return true;
        } else if (item.getItemId() == R.id.mItemShape) {
            Toast.makeText(this,"Button turned to a square!", Toast.LENGTH_SHORT).show();
            //Change Shape
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) btnChanger.getLayoutParams();
            layoutParams.width = 3000;
            btnChanger.setLayoutParams(layoutParams);

        } else if (item.getItemId() == R.id.mItemTextColor) {
            Toast.makeText(this,"Text color became Green!", Toast.LENGTH_SHORT).show();
            //Change Text Color
            btnChanger.setText("Omyyy a text!!!");
            btnChanger.setTextColor(Color.GREEN);
            return true;

        } else if (item.getItemId() == R.id.mItemReset) {
            Toast.makeText(this, "Reset Object Item is clicked", Toast.LENGTH_SHORT).show();
            ConstraintLayout.LayoutParams layoutParam = (ConstraintLayout.LayoutParams) btnChanger.getLayoutParams();
            layoutParam.width = 2038;
            layoutParam.height = 2037;
            btnChanger.setLayoutParams(layoutParam);
            ViewGroup.LayoutParams params = btnChanger.getLayoutParams();
            params.width = params.width / 2;
            params.height = params.height / 2;
            btnChanger.setLayoutParams(params);
            btnChanger.setText("");
            btnChanger.setBackgroundColor(Color.parseColor("#6200ee"));

            return true;
        } else if (item.getItemId() == R.id.mItemExit) {
            finish();
        }

        return true;
    }







}//MenuExercise