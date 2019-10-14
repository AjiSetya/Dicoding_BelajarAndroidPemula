package com.blogspot.blogsetyaaji.marvelhero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    private ArrayList<Marvel> dataMarvel = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView detailImage = findViewById(R.id.detail_image);
        TextView detailTitle = findViewById(R.id.detail_title);
        TextView detailDetail = findViewById(R.id.detail_detail);

        Intent intent = getIntent();
        dataMarvel.addAll(MarvelData.getListData());
        String title = dataMarvel.get(intent.getIntExtra("idmarvel", 0)).getName();
        String detail = dataMarvel.get(intent.getIntExtra("idmarvel", 0)).getDetail();
        String image = dataMarvel.get(intent.getIntExtra("idmarvel", 0)).getImage();

        Glide.with(DetailActivity.this)
                .load(image)
                .into(detailImage);
        detailTitle.setText(title);
        detailDetail.setText(detail);
    }
}
