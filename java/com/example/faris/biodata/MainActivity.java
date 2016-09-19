package com.example.faris.biodata;

import android.app.Activity;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        init();
    }

    private void init() {
        Button btnTampil = (Button) findViewById(R.id.btnTampil);
        final TextView tvAngkatan = (TextView) findViewById(R.id.tvAngkatan);
        final EditText etAngkatan = (EditText) findViewById(R.id.etAngkatan);
        final TextView tvNIM = (TextView) findViewById(R.id.tvNIM);
        final EditText etNIM = (EditText) findViewById(R.id.etNIM);
        final TextView tvEmail = (TextView) findViewById(R.id.tvEmail);
        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
        final TextView tvNama = (TextView) findViewById(R.id.tvNama);
        final EditText etNama = (EditText) findViewById(R.id.etNama);


        assert btnTampil != null;
        btnTampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sNama ;
                sNama = etNama.getText().toString();
                tvNama.setText("Nama :"+ sNama);
                etNama.setVisibility(View.INVISIBLE);

                String sEmail;
                sEmail = etEmail.getText().toString();
                tvEmail.setText("Email :"+sEmail);
                etEmail.setVisibility(View.INVISIBLE);

                String sNIM;
                sNIM = etNIM.getText().toString();
                tvNIM.setText("NIM :"+sNIM);
                etNIM.setVisibility(View.INVISIBLE);

                String sAngkatan;
                sAngkatan = etAngkatan.getText().toString();
                tvAngkatan.setText("Angkatan :"+sAngkatan);
                etAngkatan.setVisibility(View.INVISIBLE);


            }
        });
    }
}