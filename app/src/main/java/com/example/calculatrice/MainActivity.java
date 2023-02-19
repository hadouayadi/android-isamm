package com.example.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button plus, moin , diviser , multiplier ;
EditText chiffre1 , chiffre2;
TextView myTextView;
int x ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus = findViewById(R.id.plus);
        moin=findViewById(R.id.moin);
        diviser = findViewById(R.id.diviser);
        multiplier = findViewById(R.id.multiplier);
        chiffre1 = findViewById(R.id.chiffre1);
        chiffre2 =  findViewById(R.id.chiffre2);
        myTextView = findViewById(R.id.resultat);
        plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                x=Integer.parseInt(chiffre1.getText().toString())+Integer.parseInt(chiffre2.getText().toString());
                myTextView.setText(""+x);
            }
        });
        moin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                x=Integer.parseInt(chiffre1.getText().toString())-Integer.parseInt(chiffre2.getText().toString());
                myTextView.setText(""+x);
            }
        });
        diviser.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                x=Integer.parseInt(chiffre1.getText().toString())/Integer.parseInt(chiffre2.getText().toString());
                myTextView.setText(""+x);
            }
        });
        multiplier.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                x=Integer.parseInt(chiffre1.getText().toString())*Integer.parseInt(chiffre2.getText().toString());
                myTextView.setText(""+x);
            }
        });


    }
}