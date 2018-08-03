package com.example.team3.wens_farm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sign_In extends AppCompatActivity implements View.OnClickListener{
    private EditText number;
    private EditText password;
    private EditText resurePassword;
    private EditText identifyingCode;
    private TextView sendIndentifyingCode;
    private Button signIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__in);
        inite();
    }
    private void inite(){
        number = (EditText)findViewById(R.id.sign_in_number_edittext);
        password =(EditText)findViewById(R.id.sign_in_password_edittext);
        resurePassword =(EditText)findViewById(R.id.sign_in_resurePassword_edittext);
        identifyingCode = (EditText)findViewById(R.id.sign_in_resurePassword_edittext);
        sendIndentifyingCode = (TextView)findViewById(R.id.send_identifyingCode);

        sendIndentifyingCode.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.send_identifyingCode:
               // identifyingCode.setBackground();
        }
    }
}
