package com.example.e_vote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VotePageActivity extends AppCompatActivity {

    private Button b_p_c_1, b_p_c_2, b_d_c_1, b_d_c_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote_page);

        b_p_c_1 = (Button) findViewById(R.id.b_p_c_1);
        b_d_c_1 = (Button) findViewById(R.id.b_d_c_1);
        b_p_c_2 = (Button) findViewById(R.id.b_p_c_2);
        b_d_c_2 = (Button) findViewById(R.id.b_d_c_2);

        b_p_c_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent register = new Intent(getApplicationContext(),SuccesActivity.class);
                startActivity(register);
            }
        });

        b_p_c_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent register = new Intent(getApplicationContext(),SuccesActivity.class);
                startActivity(register);
            }
        });
    }
}
