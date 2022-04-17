package com.hakancevik.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1Text;
    EditText number2Text;
    TextView textView;
    int number1,number2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1Text = findViewById(R.id.number1Text);
        number2Text = findViewById(R.id.number2Text);
        textView = findViewById(R.id.textView);
    }


    public void sum(View view) {
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            textView.setText("Please, Enter a Number!");
        }
        else{
            number1 = Integer.parseInt(number1Text.getText().toString());
            number2 = Integer.parseInt(number2Text.getText().toString());

            result=number1 + number2;

            textView.setText("Result = " + result);

        }
    }


    public void subtraction(View view) {
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            textView.setText("Please, Enter Number!");
        }
        else{
            number1 = Integer.parseInt(number1Text.getText().toString());
            number2 = Integer.parseInt(number2Text.getText().toString());

            result=number1 - number2;

            textView.setText("Result = "+result);

        }

    }


    public void multiply(View view) {

        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            textView.setText("Please, Enter a Number!");
        }
        else{
            number1 = Integer.parseInt(number1Text.getText().toString());
            number2 = Integer.parseInt(number2Text.getText().toString());

            result=number1 * number2;

            textView.setText("Result = " + result);

        }

    }

    public void devide(View view) {

        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            textView.setText("Please, Enter a Number!");
        }
        else{
            number1 = Integer.parseInt(number1Text.getText().toString());
            number2 = Integer.parseInt(number2Text.getText().toString());

            result=number1 / number2;

            textView.setText("Result = "+result);

        }
    }

}