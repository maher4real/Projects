package com.example.chatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class PhotoViewer extends AppCompatActivity
{
    private ImageView imageView;
    private String imageUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_viewer);

        imageView=findViewById(R.id.image_viewer);
        imageUrl=getIntent().getStringExtra("url");

        Picasso.get().load(imageUrl).into(imageView);
    }
}
