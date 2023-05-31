package com.example.lab_5;

public class danhSachModel {
    private String ten;
    private String diaChi;
    private String logo;

    public danhSachModel(String ten, String diaChi, String logo) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.logo = logo;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
