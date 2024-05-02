package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PassingIntentsExercise2 extends AppCompatActivity {

    TextView tFname;
    TextView tLname;
    TextView tGender;
    TextView tPnum;
    TextView tBdate;
    TextView tEmail;
    TextView tFatherName;
    TextView tMotherName;
    TextView temContact;
    TextView temNumber;
    TextView temRelation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise2);

        tFname = findViewById(R.id.txtPl2Fname);    tLname = findViewById(R.id.txtPl2Lname);
        tGender = findViewById(R.id.txtPlGender);   tBdate = findViewById(R.id.txtPlBdate);
        tPnum = findViewById(R.id.txtPlNumber);     tEmail = findViewById(R.id.txtPlEmail);
        tFatherName = findViewById(R.id.txtPlFatherName);   tMotherName = findViewById(R.id.txtPlMotherName);
        temContact = findViewById(R.id.txtPlEmName);        temNumber = findViewById(R.id.txtPlContactNum);
        temRelation = findViewById(R.id.txtPlRelationship);


        Intent intent = getIntent();

        String fname = intent.getStringExtra("fname_key");
        String lname = intent.getStringExtra("lname_key");
        String pnum = intent.getStringExtra("pnum_key");
        String gender = intent.getStringExtra("gender_key");
        String bdate = intent.getStringExtra("bdate_key");
        String email = intent.getStringExtra("eadd_key");
        String fathername = intent.getStringExtra("father_key");
        String mothername = intent.getStringExtra("mother_key");
        String emName = intent.getStringExtra("emName_key");
        String emNumber = intent.getStringExtra("emNumber_key");
        String emRelation = intent.getStringExtra("emRelationship_key");

        tFname.setText(fname);
        tLname.setText(lname);
        tPnum.setText(pnum);
        tGender.setText(gender);
        tBdate.setText(bdate);
        tEmail.setText(email);
        tFatherName.setText(fathername);
        tMotherName.setText(mothername);
        temContact.setText(emName);
        temNumber.setText(emNumber);
        temRelation.setText(emRelation);

    }
}