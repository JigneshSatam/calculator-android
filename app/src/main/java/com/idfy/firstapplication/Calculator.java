package com.idfy.firstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.charset.CharacterCodingException;

public class Calculator extends AppCompatActivity implements View.OnClickListener  {
    private boolean operatorInserted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Intent i = getIntent();
        setTitle(i.getStringExtra("userName"));

        Button one = (Button) findViewById(R.id.one);
        one.setOnClickListener(this);

        Button two = (Button) findViewById(R.id.two);
        two.setOnClickListener(this);

        Button three = (Button) findViewById(R.id.three);
        three.setOnClickListener(this);

        Button four = (Button) findViewById(R.id.four);
        four.setOnClickListener(this);

        Button five = (Button) findViewById(R.id.five);
        five.setOnClickListener(this);

        Button six = (Button) findViewById(R.id.six);
        six.setOnClickListener(this);

        Button seven = (Button) findViewById(R.id.seven);
        seven.setOnClickListener(this);

        Button eight = (Button) findViewById(R.id.eight);
        eight.setOnClickListener(this);

        Button nine = (Button) findViewById(R.id.nine);
        nine.setOnClickListener(this);

        Button zero = (Button) findViewById(R.id.zero);
        zero.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Button b = (Button) view;
        String str = String.valueOf(b.getText());
        TextView v = (TextView) findViewById(R.id.result);
        String expression = String.valueOf(v.getText());
        switch (str){
            case "+":
                char last = expression.charAt(expression.length());
                if (last == '-'){

                }
                break;
            case "-":
                break;
            case "*":
                break;
            case "/":
                break;
            case "=":
                break;
            default:
                String newExpression = expression + str;
                v.setText(newExpression);
        }
    }
}
