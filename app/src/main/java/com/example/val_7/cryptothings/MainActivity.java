package com.example.val_7.cryptothings;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView text;
    private Button   button;
    private android.support.v7.widget.Toolbar  toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);
        button = (Button) findViewById(R.id.button);
        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);

        getSupportActionBar().setSubtitle("Using ToolBar");
        setSupportActionBar(toolbar);


        button.setOnClickListener(this);


    }


    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button:
                text.setText("Clicked");
                break;

            default:
                break;
        }
    }
}
