package com.example.aplikasiberitauts;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.RequestOptions;

import java.security.AccessController;
import java.util.ArrayList;

public class BeritaAdapter extends RecyclerView.Adapter<BeritaAdapter.ListViewHolder> {
    private final ArrayList<Berita> listBerita;
    public BeritaAdapter(ArrayList<Berita> berita) {
        this.listBerita = berita;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_berita, parent, false);
        return new ListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final Berita berita = listBerita.get(position);
        Glide.with(holder.itemView.getContext()).load(berita.getImage()).apply(new RequestOptions()
                .override(100, 100)).into(holder.picture);
        holder.txtTitle.setText(berita.getTitle());
        holder.txtAuthor.setText(berita.getAuthor());
        holder.txtContent.setText(berita.getContent());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetailBeritaActivity.class);
                Bundle bundle = new Bundle();

                bundle.putInt("picture", berita.getImage());
                bundle.putString("title", berita.getTitle());
                bundle.putString("author", berita.getAuthor());
                bundle.putString("content", berita.getContent());

                intent.putExtras(bundle);
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listBerita.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitle, txtAuthor, txtContent;
        ImageView picture;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            picture = itemView.findViewById(R.id.mini_picture);
            txtTitle = itemView.findViewById(R.id.txt_title);
            txtAuthor = itemView.findViewById(R.id.txt_author);
            txtContent = itemView.findViewById(R.id.txt_content);
        }
    }
}
