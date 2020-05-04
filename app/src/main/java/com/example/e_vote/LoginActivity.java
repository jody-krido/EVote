package com.example.e_vote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    private Button b_login;
    private TextInputEditText t_user, t_pass;
    private TextView tv_Regster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tv_Regster = (TextView) findViewById(R.id.tv_register);
        b_login = (Button) findViewById(R.id.b_login);

        tv_Regster.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent register = new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(register);
            }
        });

        b_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent register = new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(register);
            }
        });
    }
}
