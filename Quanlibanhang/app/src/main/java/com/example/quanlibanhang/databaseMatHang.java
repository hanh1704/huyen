package com.example.quanlibanhang;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

public class databaseMatHang {
    SQLiteDatabase databaseMH;
    DBHelperMatHang myHelperMH;
    public databaseMatHang (Context context)
    {
        myHelperMH=new DBHelperMatHang(context);
        try {
            databaseMH=myHelperMH.getWritableDatabase();
        }
        catch (SQLiteException ex)
        {
            databaseMH=myHelperMH.getReadableDatabase();
        }
    }
    //    public void close()
//    {
//        myHelper.close();
//
//    }
    public Cursor LayTatCaDuLieu () {
        String[] cot = {myHelperMH.COT_MA_HANG_HOA, myHelperMH.COT_TEN, myHelperMH.COT_DONVI, myHelperMH.COT_GIA, myHelperMH.COT_SOLUONG};
        Cursor cursor = null;//contro tro toi tung hang ketqua
        cursor = databaseMH.query(myHelperMH.TEN_BANG, cot, null, null, null, null, myHelperMH.COT_MA_HANG_HOA + " DESC");
        return cursor;
    }
    public long Them (MatHang mh) {
        ContentValues values = new ContentValues();
        values.put(myHelperMH.COT_TEN, mh.getTenHang());
        values.put(myHelperMH.COT_DONVI, mh.getDonviHang());
        values.put(myHelperMH.COT_GIA, mh.getGiaHang());
        values.put(myHelperMH.COT_SOLUONG, mh.getSoluongHang());
        return databaseMH.insert(myHelperMH.TEN_BANG, null, values);

    }

    public long Xoa (MatHang mh) {
        return databaseMH.delete(DBHelperMatHang.TEN_BANG, DBHelperMatHang.COT_MA_HANG_HOA + "=" + "'" + mh.getMaHang() + "'", null);
    }

public long sua(MatHang mh) {
    ContentValues values = new ContentValues();
    values.put(DBHelperMatHang.COT_TEN, mh.getTenHang());
    values.put(DBHelperMatHang.COT_DONVI, mh.getDonviHang());
    values.put(DBHelperMatHang.COT_GIA, mh.getGiaHang());
    values.put(DBHelperMatHang.COT_SOLUONG, mh.getSoluongHang());
    return databaseMH.update(DBHelperMatHang
                    .TEN_BANG, values,
            DBHelperMatHang.COT_MA_HANG_HOA + " = "
                    + mh.getMaHang(), null);

}
}
