package com.example.simple_calc111;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Add(View v){
        EditText et1 =(EditText)findViewById(R.id.editTextNumber8);
        EditText et2 =(EditText)findViewById(R.id.editTextNumber10);
        EditText et3 =(EditText)findViewById(R.id.editTextNumber7);


        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1+n2;

        et3.setText("Total Value " + result);
    }
    public void Multiply(View v){
        EditText et1 =(EditText)findViewById(R.id.editTextNumber8);
        EditText et2 =(EditText)findViewById(R.id.editTextNumber10);
        EditText et3 =(EditText)findViewById(R.id.editTextNumber7);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1*n2;

        et3.setText("Total Value " + result);
    } public void Division(View v){
        EditText et1 =(EditText)findViewById(R.id.editTextNumber8);
        EditText et2 =(EditText)findViewById(R.id.editTextNumber10);
        EditText et3 =(EditText)findViewById(R.id.editTextNumber7);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1/n2;

        et3.setText("Total Value " + result);
    }public void Substraction(View v){
        EditText et1 =(EditText)findViewById(R.id.editTextNumber8);
        EditText et2 =(EditText)findViewById(R.id.editTextNumber10);
        EditText et3 =(EditText)findViewById(R.id.editTextNumber7);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1-n2;

        et3.setText("Total Value " + result);
    }

}