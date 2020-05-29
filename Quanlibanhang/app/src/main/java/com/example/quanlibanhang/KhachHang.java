package com.example.quanlibanhang;

public class KhachHang {

    private String maKH;
    private String tenKH, DiaChi, SDT;

    public KhachHang() {

    }
    public KhachHang(String maKH, String tenKH, String diaChi, String SDT) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        DiaChi = diaChi;
        this.SDT = SDT;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
}

