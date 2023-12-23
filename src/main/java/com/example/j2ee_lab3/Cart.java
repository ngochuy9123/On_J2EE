package com.example.j2ee_lab3;

public class Cart {
    private int idsp;
    private String tensp;
    private int slg;
    private int gia;

    public Cart(int idsp, String tensp, int slg, int tongGia) {
        this.idsp = idsp;
        this.tensp = tensp;
        this.slg = slg;
        this.gia = tongGia;
    }

    public int getIdsp() {
        return idsp;
    }

    public void setIdsp(int idsp) {
        this.idsp = idsp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getSlg() {
        return slg;
    }

    public void setSlg(int slg) {
        this.slg = slg;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
}
