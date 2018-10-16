package com.example.mshiep.food.model;

public class DanhGia {
    String maDanhGia;
    String maMonAn;
    int rate;
    String binhLuan;
    String tenKhachHang;

    public DanhGia(String maDanhGia, String maMonAn, int rate, String comment, String tenKhachHang) {
        this.maDanhGia = maDanhGia;
        this.maMonAn = maMonAn;
        this.rate = rate;
        this.binhLuan = comment;
        this.tenKhachHang = tenKhachHang;
    }

    public DanhGia() {
    }

    public String getMaDanhGia() {
        return maDanhGia;
    }

    public void setMaDanhGia(String maDanhGia) {
        this.maDanhGia = maDanhGia;
    }

    public String getMaMonAn() {
        return maMonAn;
    }

    public void setMaMonAn(String maMonAn) {
        this.maMonAn = maMonAn;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getBinhLuan() {
        return binhLuan;
    }

    public void setBinhLuan(String binhLuan) {
        this.binhLuan = binhLuan;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }
}
