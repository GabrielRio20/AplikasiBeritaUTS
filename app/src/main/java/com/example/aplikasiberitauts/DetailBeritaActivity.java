package com.example.aplikasiberitauts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailBeritaActivity extends AppCompatActivity {
    TextView txtTitle, txtAuthor, txtContent;
    String title, author, content;
    ImageView image;
    int picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_berita);
        getSupportActionBar().hide();

        image = findViewById(R.id.picture);
        txtTitle = findViewById(R.id.txt_title);
        txtAuthor = findViewById(R.id.txt_author);
        txtContent = findViewById(R.id.txt_content);

        Bundle bundle = getIntent().getExtras();
        picture = bundle.getInt("picture");
        title = bundle.getString("title");
        author = bundle.getString("author");
        content = bundle.getString("content");

        txtTitle.setText(title);
        txtAuthor.setText(author);
        txtContent.setText(content);
        Glide.with(DetailBeritaActivity.this).load(picture).apply(new RequestOptions()
                .override(1000, 1000)).into(image);


    }
}