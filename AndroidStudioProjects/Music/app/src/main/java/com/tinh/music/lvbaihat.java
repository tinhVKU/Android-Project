package com.tinh.music;

public class lvbaihat {
    String ten;
    String casi;
    String url;
    int anh;

    public lvbaihat(String ten, String casi, String url, int anh) {
        this.ten = ten;
        this.casi = casi;
        this.url = url;
        this.anh = anh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCasi() {
        return casi;
    }

    public void setCasi(String casi) {
        this.casi = casi;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }
}
