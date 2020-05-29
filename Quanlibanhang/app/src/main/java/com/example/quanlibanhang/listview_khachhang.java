package com.example.quanlibanhang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class listview_khachhang  extends AppCompatActivity {
    ListView listKH;
    Button addbt,editbt,deletebt,exitbt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_khachhang);
        setControl();
        setEvent();

    }
    public void setControl()
    {
        listKH=findViewById(R.id.khachhang_listview);
        addbt=findViewById(R.id.addKH);
        editbt=findViewById(R.id.editKH);
        deletebt=findViewById(R.id.deleteKH);
        exitbt=findViewById(R.id.exitKH);
    }
    public void setEvent()
    {
        exitbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(listview_khachhang.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}