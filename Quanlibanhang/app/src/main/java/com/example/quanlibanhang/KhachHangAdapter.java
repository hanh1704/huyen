package com.example.quanlibanhang;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class KhachHangAdapter extends ArrayAdapter<KhachHang> {
    Context context;
    int layoutResourceId;
    List<KhachHang> data = null;

    public KhachHangAdapter(Context context, int layoutResourceId, List<KhachHang> data) {
        super(context, layoutResourceId, data);
        this.context = context;
        this.layoutResourceId = layoutResourceId;
        this.data = data;
    }
    public class KhachHangHolder {
        TextView txt1, txt2, txt3, txt4;
    }
    @Override
    public View getView(int position, View convert, ViewGroup parent) {
        KhachHangHolder holder = new KhachHangHolder();

        if (convert != null) {
            holder = (KhachHangHolder) convert.getTag();
        } else {
            convert = LayoutInflater.from(context).inflate(R.layout.item_khachhang,parent,false);
            holder.txt1 = (TextView) convert.findViewById(R.id.makhet);
            holder.txt2 = (TextView) convert.findViewById(R.id.tenkhet);
            holder.txt3 = (TextView) convert.findViewById(R.id.diachiet);
            holder.txt4 = (TextView) convert.findViewById(R.id.sdtet);

            convert.setTag(holder);
        }

        KhachHang kh = data.get(position);

//        holder.img.setImageResource(R.drawable.logo);
        holder.txt1.setText("Mã KH: " + kh.getMaKH());
        holder.txt2.setText("Tên KH: " + kh.getTenKH());
        holder.txt3.setText("Địa chỉ: " + kh.getDiaChi());
        holder.txt4.setText("Điện thoại: " + kh.getSDT());

        return convert;
    }

}
