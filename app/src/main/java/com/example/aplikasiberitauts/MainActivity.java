package com.example.aplikasiberitauts;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Berita> berita = new ArrayList<>();
    TextView kategori;
    BeritaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        recyclerView = findViewById(R.id.rev_berita);
        kategori = findViewById(R.id.judul_kategori);

        LinearLayoutManager lm = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        adapter = new BeritaAdapter(berita);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(lm);
        recyclerView.setHasFixedSize(true);

        Intent intent = getIntent();
        String message = intent.getStringExtra(DetailDataActivity.MESSAGE_EXTRA);
        int usiaUser = intent.getIntExtra("usiaUser", 1);
        kategori.setText(message);

        if(Objects.equals(message, "Game") && usiaUser < 17){
            berita.addAll(DataBerita.showBeritaGame());
        }
        else if(Objects.equals(message, "Game") && usiaUser >= 17){
            berita.addAll(DataBerita.showBeritaGameAdult());
            berita.addAll(DataBerita.showBeritaGame());
        }
        else if(Objects.equals(message, "Film") && usiaUser < 17){
            berita.addAll(DataBerita.showBeritaFilm());
        }
        else if(Objects.equals(message, "Film") && usiaUser >= 17){
            berita.addAll(DataBerita.showBeritaFilmAdult());
            berita.addAll(DataBerita.showBeritaFilm());
        }
        else if(Objects.equals(message, "Gadget") && usiaUser < 17){
            berita.addAll(DataBerita.showBeritaGadget());
        }
        else if(Objects.equals(message, "Gadget") && usiaUser >= 17){
            berita.addAll(DataBerita.showBeritaGadgetAdult());
            berita.addAll(DataBerita.showBeritaGadget());
        }
        else{
            showAlertDialog();
        }

    }

    public void showAlertDialog(){
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(MainActivity.this);
        alertBuilder.setTitle("Warning");
        alertBuilder.setMessage("Tolong Isikan Tanggal Lahir terlebih dahulu");

        alertBuilder.setNeutralButton("Oke", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Oke", Toast.LENGTH_SHORT).show();
            }
        });

        alertBuilder.show();
    }


}