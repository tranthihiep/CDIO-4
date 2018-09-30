package com.example.mshiep.food.model;

public class TrangThai {
    String maTrangThai;
    int trangThai;
    String soBan;
    float tongTien;


    public TrangThai() {
    }

    public TrangThai(String maTrangThai, int trangThai, String soBan, float tongTien) {
        this.maTrangThai = maTrangThai;
        this.trangThai = trangThai;
        this.soBan = soBan;
        this.tongTien = tongTien;
    }

    public String getMaTrangThai() {
        return maTrangThai;
    }

    public void setMaTrangThai(String maTrangThai) {
        this.maTrangThai = maTrangThai;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getSoBan() {
        return soBan;
    }

    public void setSoBan(String soBan) {
        this.soBan = soBan;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }
}
