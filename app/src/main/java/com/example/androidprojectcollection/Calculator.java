package com.example.androidprojectcollection;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class Calculator extends AppCompatActivity{

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    Button btnAdd, btnSubtract, btnMultiply, btnDivide;
    Button btnPoint, btnClearEverything, btnDelete, btnAns;
    TextView tvTopText, tvBottomText;

    List<Button> buttonNum, buttonOperation;
    List<String> listEquation;
    String SequentialRes, SequentialTemp;
    StringBuilder num, equation;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        setButtonsAndTextview();
        assignOnClickListeners();
        listEquation = new ArrayList<>();

    }

    private void assignOnClickListeners(){

        btnClearEverything.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClearCalc();
            }
        });

        for(Button number : buttonNum){
            number.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    StringBuilder currentNum = new StringBuilder(number.getText().toString());

                    if(num.length() == 1 && num.charAt(0) == '0'){
                        num.setCharAt(0,currentNum.charAt(0));
                    } else {
                        num.append(currentNum);
                    }
                    tvBottomText.setText(equation.toString());
                    tvBottomText.append(num.toString());

                    tvTopText.setText(calcuSequential());

                }
            });
        }
    }


    private void setButtonsAndTextview(){
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
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

        tvTopText = findViewById(R.id.tvTopText);
        tvBottomText = findViewById(R.id.tvBottomText);

        buttonNum = new ArrayList<>();
        buttonOperation = new ArrayList<>();

        buttonNum.add(btn0);
        buttonNum.add(btn1);
        buttonNum.add(btn2);
        buttonNum.add(btn3);
        buttonNum.add(btn4);
        buttonNum.add(btn5);
        buttonNum.add(btn6);
        buttonNum.add(btn7);
        buttonNum.add(btn8);
        buttonNum.add(btn9);

        buttonOperation.add(btnAdd);
        buttonOperation.add(btnSubtract);
        buttonOperation.add(btnMultiply);
        buttonOperation.add(btnDivide);

    }

    private void ClearCalc(){
        tvTopText.setText("");
        tvBottomText.setText("");
        num.setLength(0);
        equation.setLength(0);
        listEquation.clear();
        SequentialRes = null;
    }

    private String calcuSequential() {
        if (listEquation.isEmpty()) {
            SequentialRes = num.toString();
            return "";
        }

        if (num.length() == 1) {
            SequentialTemp = SequentialRes;
        }

        SequentialRes = SequentialRes;
        if (!SequentialRes.equals("ERROR")) {
            BigDecimal left = new BigDecimal(SequentialRes);
            BigDecimal right = new BigDecimal(num.toString());
            char op = listEquation.get(listEquation.size() - 1).charAt(0);

            BigDecimal temp_result = new BigDecimal(0);

            switch (op) {
                case '+':
                    temp_result = left.add(right);
                    break;
                case '-':
                    temp_result = left.subtract(right);
                    break;
                case '×':
                    temp_result = left.multiply(right);
                    break;
                case '÷':
                    try {
                        temp_result = left.divide(right);
                    } catch (ArithmeticException a) {
                        if (Objects.requireNonNull(a.getMessage()).contains("Division by zero")) {
                            SequentialRes = "ERROR";
                            return "ERROR";
                        }
                        temp_result = left.divide(right, 11, RoundingMode.HALF_EVEN);
                    }
                    break;
            }
            SequentialRes = temp_result.toString();
        }
        return SequentialRes;
    }

    private String calcMDAS(){
        postfixExpression();

        Stack<String> calculation = new Stack<>();

        for(String e : listEquation){
            /* IF current STRING is an OPERAND, PUSH into the STACK
            /* ELSE, POP 2 times to get the OPERANDS in the STACK & PERFORM operation */

            if(e.contains(".") || Character.isDigit(e.charAt(0))){
                System.out.println("Pushing: " + e);
                calculation.push(e);
            } else {
                BigDecimal right = new BigDecimal(calculation.pop());
                System.out.println("Popping");
                System.out.println(right);
                System.out.println(calculation.peek);
            }
        }
    }

}//calculator
