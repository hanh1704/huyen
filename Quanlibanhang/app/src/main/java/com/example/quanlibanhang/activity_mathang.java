package com.example.quanlibanhang;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class activity_mathang extends AppCompatActivity {
    EditText maHang,tenHang,donviHang, giaHang, soluongHang;
    Button ok,huy;
    databaseMatHang dbmh;
    ArrayList <MatHang> data = new ArrayList<MatHang>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mh);
        setControl();
        setEvent();
    }

    public void setControl()
    {
        maHang=findViewById(R.id.mahangEt);
        tenHang=findViewById(R.id.tenhangEt);
        donviHang=findViewById(R.id.donviEt);
        giaHang=findViewById(R.id.giaEt);
        soluongHang=findViewById(R.id.soluongEd);
        ok=findViewById(R.id.okbt);
        huy=findViewById(R.id.huybt);
    }

    public void setEvent()
    {
        dbmh=new databaseMatHang(this);
        Intent intent =getIntent();
        final int vitri = intent.getIntExtra("vitri",0);

        int role=intent.getIntExtra("role",-2);
        //nếu màn hình kia bấm nút sửa
        if (role==-1)
        {
            //lay du lieu tu database va gan vao mang data
            capNhatDuLieu();

        tenHang.setText(data.get(vitri).getTenHang());
        donviHang.setText(data.get(vitri).getDonviHang());
        giaHang.setText(data.get(vitri).getGiaHang());
        soluongHang.setText(data.get(vitri).getSoluongHang());
        maHang.setText(data.get(vitri).getMaHang());
        maHang.setEnabled(false);
        ok.setOnClickListener(new View.OnClickListener() {
            //click vào button ok thì dữ liêu lấy từ giao diện được lưu vào class
            @Override
            public void onClick(View v) {
                MatHang mh=data.get(vitri);
                mh.setTenHang(tenHang.getText().toString());
                mh.setDonviHang(donviHang.getText().toString());
                mh.setGiaHang(giaHang.getText().toString());
                mh.setSoluongHang(soluongHang.getText().toString());
                dbmh.sua(mh);

            }
        });

        }

//nút thêm
if(role!=-1) {
    ok.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
//                if (maHang.getText().toString().equals(""))
//                {
//                    maHang.setError("ban phai nhap ma hang");
//                    maHang.requestFocus();
//                    return;
//                }
            tenHang.setEnabled(false);
            if (tenHang.getText().toString().equals("")) {
                tenHang.setError("ban phai nhap ten hang");
                tenHang.requestFocus();
                return;
            }
            if (donviHang.getText().toString().equals("")) {
                donviHang.setError("ban phai nhap don vi hang");
                donviHang.requestFocus();
                return;
            }
            if (giaHang.getText().toString().equals("")) {
                giaHang.setError("ban phai nhap gia hang");
                giaHang.requestFocus();
                return;
            }
            if (soluongHang.getText().toString().equals("")) {
                soluongHang.setError("ban phai nhap so luong hang");
                soluongHang.requestFocus();
                return;
            }
            MatHang mh = layDLTuGiaoDien();
            dbmh.Them(mh);
        }

    });}
    huy.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(activity_mathang.this, listview_sanpham.class);
            startActivity(intent);
        }
    });


    }
    public MatHang layDLTuGiaoDien(){
        MatHang mh=new MatHang();
     //   mh.setMaHang(maHang.getText().toString());
        mh.setTenHang(tenHang.getText().toString());
        mh.setDonviHang(donviHang.getText().toString());
        mh.setGiaHang(giaHang.getText().toString());
        mh.setSoluongHang(soluongHang.getText().toString());
        return mh;
    }


    public void capNhatDuLieu() {
        Cursor cursor = dbmh.LayTatCaDuLieu();
        if (cursor != null) {
            while (cursor.moveToNext()) {
                MatHang mh = new MatHang();
                mh.setMaHang("" + cursor.getInt(0));
                mh.setTenHang(cursor.getString(1));
                mh.setDonviHang(cursor.getString(2));
                mh.setGiaHang("" + cursor.getFloat(3));
                mh.setSoluongHang("" + cursor.getInt(4));
                data.add(mh);

            }

        }


    }
}
