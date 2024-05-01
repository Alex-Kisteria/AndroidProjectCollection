package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class PassingIntentsExercise extends AppCompatActivity {

    EditText ptFname;
    EditText ptLname;
    EditText ptDate;
    EditText ptPnumber;
    EditText ptEmail;
    RadioButton radMale;
    RadioButton radFemale;
    RadioButton radOthers;
    EditText ptFather;
    EditText ptMother;
    EditText ptEmName;
    EditText ptEmNumber;
    EditText ptRelationship;
    Button btnSubmit;
    Button btnClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise);

        btnSubmit = (Button) findViewById(R.id.btnPISubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickSubmit();
            }
        });

    }

    public void onClickSubmit(View v){
        String fName = ptFname.getText().toString();
        String lname = ptLname.getText().toString();

        String gender;
        if(radMale.isChecked()){
            gender = "Male";
        } else if (radFemale.isChecked()) {
            gender = "Female";
        } else if (radOthers.isChecked()) {
            gender = "Others";
        } else {
            gender = "Unknown";
        }

        String bDate = ptDate.getText().toString();
        String pNumber = ptPnumber.getText().toString();
        String emailAdd = ptEmail.getText().toString();
        String father = ptFather.getText().toString();
        String mother = ptMother.getText().toString();
        String emName = ptEmName.getText().toString();
        String emNumber = ptEmNumber.getText().toString();
        String emRelationship = ptRelationship.getText().toString();

        Intent intent = new Intent(PassingIntentsExercise.this, PassingIntentsExercise2.class);

        //places the value of stringVariable and place it into intent object
        intent.putExtra("fname_key", fName);    intent.putExtra("lname_key", lname);
        intent.putExtra("gender_key", gender);  intent.putExtra("bdate_key", bDate);
        intent.putExtra("pnum_key", pNumber);   intent.putExtra("eadd_key", emailAdd);
        intent.putExtra("father_key", father);  intent.putExtra("mother_key", mother);
        intent.putExtra("emName_key", emName);  intent.putExtra("emNumber_key", emNumber);
        intent.putExtra("emRelationship_key", emRelationship);

        startActivity(intent);
    }


}