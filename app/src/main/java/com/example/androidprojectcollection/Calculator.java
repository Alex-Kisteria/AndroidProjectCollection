package com.example.androidprojectcollection;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class Calculator extends AppCompatActivity implements View.OnClickListener{

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    Button btnAdd, btnSubtract, btnMultiply, btnDivide;
    Button btnPoint, btnClearEverything, btnDelete, btnAns;
    TextView tvTopText, tvBottomText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btnMatch3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnAns = findViewById(R.id.btnAns);

        btnPoint = findViewById(R.id.btnPoint);
        btnClearEverything = findViewById(R.id.btnClearEverything);
        btnDelete = findViewById(R.id.btnDelete);
    }

    @Override
    public void onClick(View view){
        MaterialButton button = (MaterialButton) view;
        String buttonText = button.getText().toString();
        String dataToCalculate = tvTopText.getText().toString();

        if (buttonText.equals("CE")){
            tvTopText.setText("");
            tvBottomText.setText("0");
            return;
        }

        dataToCalculate = dataToCalculate+buttonText;
        tvTopText.setText(dataToCalculate);
    }



}
