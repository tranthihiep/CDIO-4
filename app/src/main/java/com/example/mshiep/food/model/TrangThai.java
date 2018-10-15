package com.example.mshiep.food.model;

public class TrangThai {
    String maTrangThai;
    int trangThai;
    String soBan;
    String tongTien;


    public TrangThai() {
    }

    public TrangThai(String maTrangThai, int trangThai, String soBan, String tongTien) {
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

    public String getTongTien() {
        return tongTien;
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }
}
