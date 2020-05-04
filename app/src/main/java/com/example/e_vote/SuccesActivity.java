package com.example.e_vote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SuccesActivity extends AppCompatActivity {

    private Button b_kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_succes);

        b_kembali = (Button) findViewById(R.id.b_kembali);

        b_kembali.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intn = new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(intn);
            }
        });
    }
}
