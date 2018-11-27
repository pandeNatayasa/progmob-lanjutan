package com.tr.nata.project_progmob;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton btn_1;
    RadioButton btn_2;
    Button btn_regis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        btn_1 = (RadioButton)findViewById(R.id.rd_1);
        btn_2 = (RadioButton)findViewById(R.id.rd_2);
        btn_regis = (Button)findViewById(R.id.register);
        btn_regis.setOnClickListener(RegisterActivity.this);


    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.register:
                if (btn_1.isChecked()){
                    Toast.makeText(RegisterActivity.this,"test1",Toast.LENGTH_SHORT).show();
                }

                if (btn_2.isChecked()){
                    Toast.makeText(RegisterActivity.this,"test2",Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
