package com.example.preinan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Image Slider
        ImageSlider imageSlider = findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.slider1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slider2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slider3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slider4, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slider5, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        //Onclick Cerita CardView
        CardView cardView1 = findViewById(R.id.cerita1);
        CardView cardView2 = findViewById(R.id.cerita2);
        CardView cardView3 = findViewById(R.id.cerita3);
        CardView cardView4 = findViewById(R.id.cerita4);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, DescActivity.class);
                intent.putExtra("judul","Dirumah saja");
                intent.putExtra("desc","Saat dirumah saya hanya bermain hp, scroll tiktok, ig, dan youtube. Saya juga melakukan pekerjaan rumah ,seperti menyapu, muncuci baju, dll.");
                intent.putExtra("gambar", R.drawable.cerita1);
                intent.putExtra("link","https://maps.app.goo.gl/irs3adUMaTftyvSz5");
                startActivity(intent);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, DescActivity.class);
                intent.putExtra("judul","Futsal");
                intent.putExtra("desc","Saya bermain futsal saat hari sabtu bersama teman kampung dan kita bermain selama satu jam dan itu sangat melelahkan.");
                intent.putExtra("gambar", R.drawable.cerita2);
                intent.putExtra("link","https://maps.app.goo.gl/GgvUKQpvNkK9o2DH9");
                startActivity(intent);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, DescActivity.class);
                intent.putExtra("judul","MABIT (Malam Bina, Iman, dan Taqwa)");
                intent.putExtra("desc","Agar saya tidak keluar saat malam tahun baru, saya dan teman-teman satu majlis melaksakan MABIT. Disana saya mendapat materi yang sangat berharga dan mendapat teman yang banyak dari majlis lain.");
                intent.putExtra("gambar", R.drawable.cerita3);
                intent.putExtra("link","https://maps.app.goo.gl/oLZgyAFPrmC5bJeL8");
                startActivity(intent);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, DescActivity.class);
                intent.putExtra("judul","Kemuning Trip");
                intent.putExtra("desc","Saya piknik bersama keluarga ke Kemuning, Ngargoyoso saat hari senin tanggal 1 Januari 2024. Disana saya mampir kesebuah warung dan membeli suatu makanan.");
                intent.putExtra("gambar", R.drawable.cerita4);
                intent.putExtra("link", "https://maps.app.goo.gl/hTbMR5ZJdW6gg2nP7");
                startActivity(intent);
            }
        });
    }
}