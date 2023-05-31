package com.example.lab_5;

public class sinhVien_model {
    private int immage;
    private String ten;

    public sinhVien_model(int immage, String ten) {
        this.immage = immage;
        this.ten = ten;
    }

    public int getImmage() {
        return immage;
    }

    public void setImmage(int immage) {
        this.immage = immage;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
