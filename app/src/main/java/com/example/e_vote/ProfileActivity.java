package com.example.e_vote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class ProfileActivity extends AppCompatActivity {

    private Button b_edit, b_tambah_vote;
//    private String[] vote = {"Pemilu OSIS","Pemilihan Ketua Himpunan"};
//    private ArrayList<String> data;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

//        ListView listView = findViewById(R.id.list_item);
//        data = new ArrayList<>();
//        getData();
//        //ArrayAdapter digunakan untuk mengatur, bagaimana item pada ListView akan tampil
//        ArrayAdapter<String> adapter = new ArrayAdapter<> (this, R.layout.support_simple_spinner_dropdown_item, data);
//        listView.setAdapter(adapter);
//
//        //Menambahan Listener, untuk menangani kejadian saat salah satu item listView di klik
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                //Mendapatkan Nama pada salah satu item yang diklik, berdasarkan posisinya
//                String getName = data.get(position);
//
//                //Berpindah Activity dan Mempassing data Nama pada Activity Selanjutnya
//                Intent sendData = new Intent(getApplicationContext(), DetailVoteActivity.class);
//                sendData.putExtra("MyVote", getName);
//                startActivity(sendData);
//            }
//        });

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        b_edit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intn = new Intent(getApplicationContext(),EditProfileActivity.class);
                startActivity(intn);
            }
        });

        b_tambah_vote.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intn = new Intent(getApplicationContext(),AddVoteActivity.class);
                startActivity(intn);
            }
        });
    }

//    private void getData(){
//        //Memasukan Semua Data mahasiswa kedalam ArrayList
//        Collections.addAll(data, vote);
//    }
}
