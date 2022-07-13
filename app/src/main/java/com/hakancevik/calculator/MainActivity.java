package com.hakancevik.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;


import com.hakancevik.calculator.databinding.ActivityMainBinding;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    double number1, number2, result=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


    }


    @SuppressLint("SetTextI18n")
    public void sum(View view) {
        if (binding.number1Text.getText().toString().matches("") || binding.number2Text.getText().toString().matches("")) {
            binding.textView.setText("Please, Enter a Number!");
        }
        else {
            number1 = Double.parseDouble(binding.number1Text.getText().toString());
            number2 = Double.parseDouble(binding.number2Text.getText().toString());

            result = number1 + number2;
            result = Double.parseDouble(new DecimalFormat("##.###").format(result));

            binding.textView.setText("Result = " + result);

        }
    }


    @SuppressLint("SetTextI18n")
    public void subtraction(View view) {
        if (binding.number1Text.getText().toString().matches("") || binding.number2Text.getText().toString().matches("")) {
            binding.textView.setText("Please, Enter a Number!");
        }
        else {
            number1 = Double.parseDouble(binding.number1Text.getText().toString());
            number2 = Double.parseDouble(binding.number2Text.getText().toString());

            result = number1 - number2;
            result = Double.parseDouble(new DecimalFormat("##.###").format(result));

            binding.textView.setText("Result = " + result);

        }

    }

    @SuppressLint("SetTextI18n")
    public void multiply(View view) {

        if (binding.number1Text.getText().toString().matches("") || binding.number2Text.getText().toString().matches("")) {
            binding.textView.setText("Please, Enter a Number!");
        }
        else {
            number1 = Double.parseDouble(binding.number1Text.getText().toString());
            number2 = Double.parseDouble(binding.number2Text.getText().toString());

            result = number1 * number2;
            result = Double.parseDouble(new DecimalFormat("##.###").format(result));

            binding.textView.setText("Result = " + result);

        }

    }

    @SuppressLint("SetTextI18n")
    public void divide(View view) {

        if (binding.number1Text.getText().toString().matches("") || binding.number2Text.getText().toString().matches("")) {
            binding.textView.setText("Please, Enter a Number!");
        }
        else {
            number1 = Double.parseDouble(binding.number1Text.getText().toString());
            number2 = Double.parseDouble(binding.number2Text.getText().toString());

            if (number1 !=0 && number2 !=0 ){
                result = number1 / number2;
                binding.textView.setText("Result = " + result);

            }

            else if (number1 != 0) {
                binding.textView.setText("Result = Undefined!");
            }


        }
    }

}