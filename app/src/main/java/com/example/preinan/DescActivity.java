package com.example.preinan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DescActivity extends AppCompatActivity {

    String ling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);

        ImageView imageView = findViewById(R.id.imageDetail);
        TextView judul = findViewById(R.id.namaCerita);
        TextView desc = findViewById(R.id.descCerita);
        Intent intent = getIntent();

        String title = intent.getStringExtra("judul");
        String desk = intent.getStringExtra("desc");
        ling = intent.getStringExtra("link");
        int gambar = intent.getIntExtra("gambar", 0);

        judul.setText(title);
        desc.setText(desk);
        imageView.setImageResource(gambar);
    }

    public void openGmaps(View view) {
        Uri location = Uri.parse(ling);
        Intent intent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(intent);
    }
}