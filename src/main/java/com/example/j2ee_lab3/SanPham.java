package com.example.j2ee_lab3;

public class SanPham {
    private int id;
    private String tensp;
    private int gia;
    private int slg;

    public SanPham(int id, String tensp, int gia,int slg) {
        this.id = id;
        this.tensp = tensp;
        this.gia = gia;
        this.slg = slg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSlg() {
        return slg;
    }

    public void setSlg(int slg) {
        this.slg = slg;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
}
