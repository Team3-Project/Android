package com.example.team3.wens_farm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Log_In extends AppCompatActivity implements View.OnClickListener{
    private EditText number;
    private EditText password;
    private Button log_in;
    private Button sign_in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log__in);

        inite();
    }

    private void inite(){
        number = (EditText)findViewById(R.id.log_in_number_editText);

        password =(EditText)findViewById(R.id.log_in_password_editText);
        log_in =(Button)findViewById(R.id.log_in_button);
        log_in.setOnClickListener(this);
        sign_in = (Button)findViewById(R.id.log_in_sign_in_button);
        sign_in.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.log_in_button:
                Intent intent = new Intent(Log_In.this,WelcomeAfterLogin.class);
                startActivity(intent);
                break;
            case R.id.log_in_sign_in_button:
                Intent intent2 = new Intent(Log_In.this,Sign_In.class);
                startActivity(intent2);
                break;
        }
    }
}
