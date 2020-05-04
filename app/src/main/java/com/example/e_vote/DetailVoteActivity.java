package com.example.e_vote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class DetailVoteActivity extends AppCompatActivity {

//    private TextInputEditText ti_nama_vote, ti_detail_vote;
    private Button b_tambah_kandidat, b_hapus_kendidat, b_kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_vote);

//        ti_nama_vote = (TextInputEditText) findViewById(R.id.ti_nama_vote);
//        ti_detail_vote = (TextInputEditText) findViewById(R.id.ti_detail_vote);
//
//        String vdata = getIntent().getExtras().getString("MyVote");
//
//        switch (vdata){
//            case "Pemilu OSIS":
//                ti_nama_vote.setText("Pemilihan Ketua OSIS");
//                ti_detail_vote.setText("vote ini bertujuan untuk menentukan ketua Osis selanjutnya");
//                break;
//            case "Pemilihan Ketua Himpunan":
//                ti_nama_vote.setText("Pemilihan Ketua Himpunan");
//                ti_detail_vote.setText("vote ini bertujuan untuk menentukan ketua Himpunan selanjutnya");
//                break;
//        }

        b_tambah_kandidat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intn = new Intent(getApplicationContext(),AddCandidateActivity.class);
                startActivity(intn);
            }
        });

        b_kembali.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intn = new Intent(getApplicationContext(),ProfileActivity.class);
                startActivity(intn);
            }
        });
    }
}
