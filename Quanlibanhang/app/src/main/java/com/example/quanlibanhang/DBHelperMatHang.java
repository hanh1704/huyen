package com.example.quanlibanhang;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelperMatHang  extends SQLiteOpenHelper {

    public static final String TEN_DATABASE = "QuanLyBanHang";
    public static final String TEN_BANG ="Mathang";
    public static final String COT_MA_HANG_HOA ="_id";
    public static final String COT_TEN ="_ten";
    public static final String COT_DONVI ="_dv";
    public static final String COT_GIA ="_gia";
    public static final String COT_SOLUONG ="_soluong";
    private static final String TAO_BANG_HANGHOA =""+"create table "+TEN_BANG+"("+COT_MA_HANG_HOA +" integer primary key autoincrement, " +COT_TEN+" text not null, "+COT_DONVI+" text not null, "+COT_GIA+" text not null, "+COT_SOLUONG+" text not null );";
    public DBHelperMatHang (Context context)
    {
        super(context,TEN_DATABASE,null,1);

    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TAO_BANG_HANGHOA);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        String drop_students_table = String.format("DROP TABLE IF EXISTS %s", TEN_BANG_SINHVIEN);
//        db.execSQL(drop_students_table);
//
//        onCreate(db);

    }
}
