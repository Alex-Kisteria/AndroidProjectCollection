package com.example.androidprojectcollection;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class match3 extends AppCompatActivity {

    Button btnOpenMatch3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match3);
        getWindow().setBackgroundDrawableResource(R.color.white);

        btnOpenMatch3 = (Button) findViewById(R.id.btnMatch3);


        Button[][] buttonArray = new Button[5][5];

        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                String buttonId = "btnR" + (row + 1) + "C" + (col + 1);
                int resId = getResources().getIdentifier(buttonId, "id", getPackageName());
                buttonArray[row][col] = findViewById(resId);
            }
        }

       private int getRandomColor(){
            Random random = new Random();
            for (Button[] rowButtons : buttonArray) {
                for (Button button : rowButtons) {
                    int color = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));
                    button.setBackgroundColor(color);
                }
            }
        }

        private void swapColorsWithAdjacentButtons(Button clickedButton) {
            // Implement logic to find adjacent buttons (based on row and column)
            // Swap colors with those buttons
        }

        for (Button button: btnArray) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int newColor = getRandomColor();

                    button.setBackgroundColor(newColor);

                    swapColorsWithAdjacentButtons(button);
                }
            });
            
        }










    } //onCreate
} //AppCompat






