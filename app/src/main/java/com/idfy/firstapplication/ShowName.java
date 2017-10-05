package com.idfy.firstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowName extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_name);

        Intent i = getIntent();
        String userName = i.getStringExtra("userName");
        ((TextView) findViewById(R.id.show_name)).setText(userName);
        calcBinder(userName);
    }

    private void calcBinder(final String userName){
        Button startCalc = (Button)findViewById(R.id.start_calc);
        startCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ShowName.this, Calculator.class);
                i.putExtra("userName", userName);
                startActivity(i);
            }
        });
    }
}
