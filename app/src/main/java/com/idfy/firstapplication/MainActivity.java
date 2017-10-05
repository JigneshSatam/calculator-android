package com.idfy.firstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView label = (TextView) findViewById(R.id.show_name);
        label.setText("Enter Name");
        Button showName = (Button) findViewById(R.id.show_name_button);
        showName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewWindow(label);

            }
        });
    }

    private void openNewWindow(TextView label){
        EditText edit = (EditText) findViewById(R.id.enter_name);
        String userName = String.valueOf(edit.getText());
        if (userName.length() == 0) edit.setError("Please enter your name");
        else {
            Intent i = new Intent(MainActivity.this, ShowName.class);
            i.putExtra("userName", userName);
            startActivity(i);
        }
    }

}
