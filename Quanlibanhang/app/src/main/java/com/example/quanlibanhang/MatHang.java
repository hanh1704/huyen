package com.example.quanlibanhang;

public class MatHang {
    String maHang,tenHang,donviHang,giaHang,soluongHang;

    public MatHang(String maHang, String tenHang, String donviHang, String giaHang, String soluongHang) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donviHang = donviHang;
        this.giaHang = giaHang;
        this.soluongHang = soluongHang;
    }
    public MatHang()
    {

    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getDonviHang() {
        return donviHang;
    }

    public void setDonviHang(String donviHang) {
        this.donviHang = donviHang;
    }

    public String getGiaHang() {
        return giaHang;
    }

    public void setGiaHang(String giaHang) {
        this.giaHang = giaHang;
    }

    public String getSoluongHang() {
        return soluongHang;
    }

    public void setSoluongHang(String soluongHang) {
        this.soluongHang = soluongHang;
    }

    @Override
    public String toString() {
        return "MatHang{" +
                "maHang='" + maHang + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", donviHang='" + donviHang + '\'' +
                ", giaHang='" + giaHang + '\'' +
                ", soluongHang='" + soluongHang + '\'' +
                '}';
    }
}
