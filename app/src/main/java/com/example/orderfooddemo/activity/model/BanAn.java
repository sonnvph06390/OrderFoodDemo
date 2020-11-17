package com.example.orderfooddemo.activity.model;

public class BanAn {
    public int idSoBan;
    public String tenBan;
    public String trangThai;

    public BanAn(int idSoBan, String tenBan, String trangThai) {
        this.idSoBan = idSoBan;
        this.tenBan = tenBan;
        this.trangThai = trangThai;
    }

    public BanAn() {
    }

    public int getIdSoBan() {
        return idSoBan;
    }

    public void setIdSoBan(int idSoBan) {
        this.idSoBan = idSoBan;
    }

    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
