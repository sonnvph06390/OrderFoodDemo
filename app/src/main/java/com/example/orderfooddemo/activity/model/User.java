package com.example.orderfooddemo.activity.model;

public class User {
    public String userId;
    public String email;
    public String password;
    public String hoVaTen;
    public String soLanToiAn;
    public String quyen;

    public User(String userId, String email, String password, String hoVaTen, String soLanToiAn, String quyen) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.hoVaTen = hoVaTen;
        this.soLanToiAn = soLanToiAn;
        this.quyen = quyen;
    }

    public User() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getSoLanToiAn() {
        return soLanToiAn;
    }

    public void setSoLanToiAn(String soLanToiAn) {
        this.soLanToiAn = soLanToiAn;
    }

    public String getQuyen() {
        return quyen;
    }

    public void setQuyen(String quyen) {
        this.quyen = quyen;
    }
}
