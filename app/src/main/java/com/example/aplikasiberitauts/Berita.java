package com.example.aplikasiberitauts;

public class Berita {
    String title;
    String author;
    String content;
    int image;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Berita() {
        this.title = title;
        this.author = author;
        this.content = content;
        this.image = image;
    }
}
