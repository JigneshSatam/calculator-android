package com.idfy.firstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.nio.charset.CharacterCodingException;

public class Calculator extends AppCompatActivity implements View.OnClickListener  {
    private boolean operatorInserted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Intent i = getIntent();
        setTitle(i.getStringExtra("userName"));
    }

    @Override
    public void onClick(View view) {
        Button b = (Button) view;
        String str = String.valueOf(b.getText());
//        switch (str){
//            case ""
//        }
    }
}
