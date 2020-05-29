package com.example.quanlibanhang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView khImage,spImage,hdImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }
    public void setControl()
    {
        khImage=findViewById(R.id.imageKH);
        spImage=findViewById(R.id.imageSP);
        hdImage=findViewById(R.id.imageHD);
    }
    public void setEvent()
    {
        khImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,listview_khachhang.class);
                startActivity(intent);

            }
        });
        spImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,listview_sanpham.class);
                startActivity(intent);
            }
        });
        hdImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,listview_hoadon.class);
                startActivity(intent);
            }
        });
    }
}
