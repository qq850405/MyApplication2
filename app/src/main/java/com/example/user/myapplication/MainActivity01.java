package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity01 extends AppCompatActivity implements View.OnClickListener {

    TextView infoText;
    EditText nameEditText;
    RadioGroup optionsGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_main);

        infoText =(TextView)findViewById(R.id.infoText);
        nameEditText= (EditText)findViewById(R.id.nameEditText);
        optionsGroup =(RadioGroup)findViewById(R.id.optionsGroup);
        Button confirmBtn =(Button)findViewById(R.id.confirmButtom);
        confirmBtn.setOnClickListener(MainActivity01.this);
    }

    @Override
    public void onClick(View v) {
        int viewId =v.getId();
        if(viewId== R.id.confirmButtom){
            //confirmButton was clicked
            Log.d("buttonTest","confirm-button was clicked");

        }
    }
}
