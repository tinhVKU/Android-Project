package com.tinh.scrollveiw;

public class tong {
    private String ten;
    private String chebien;
    private int anh;

    public tong(String ten,String chebien,int anh) {
        this.ten = ten;
        this.chebien = chebien;
        this.anh = anh;
    }

    public String getTen() {
        return ten;
    }

    public String getChebien() {
        return chebien;
    }

    public void setChebien(String chebien) {
        this.chebien = chebien;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
