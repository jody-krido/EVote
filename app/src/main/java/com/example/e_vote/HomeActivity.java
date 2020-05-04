package com.example.e_vote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class HomeActivity extends AppCompatActivity {

    private TextInputEditText ti_code;
    private Button b_ok;
    private TextView tv_profile_h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        b_ok = (Button) findViewById(R.id.b_ok);
        tv_profile_h = (TextView) findViewById(R.id.tv_profil_h);

        b_ok.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent in_ok = new Intent(getApplicationContext(),VotePageActivity.class);
                startActivity(in_ok);
            }
        });

        tv_profile_h.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent in_prof = new Intent(getApplicationContext(),ProfileActivity.class);
                startActivity(in_prof);
            }
        });
    }
}
