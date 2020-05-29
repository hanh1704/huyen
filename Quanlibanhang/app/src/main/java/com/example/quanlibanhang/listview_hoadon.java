package com.example.quanlibanhang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class listview_hoadon extends AppCompatActivity {
    ListView listHD;
    Button addbt,editbt,deletebt,exitbt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_hoadon);
        setControl();
        setEvent();

    }
    public void setControl()
    {
        listHD=findViewById(R.id.hoadon_listview);
        addbt=findViewById(R.id.addHD);
        editbt=findViewById(R.id.editHD);
        deletebt=findViewById(R.id.deleteHD);
        exitbt=findViewById(R.id.exitHD);
    }
    public void setEvent()
    {
        exitbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(listview_hoadon.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}