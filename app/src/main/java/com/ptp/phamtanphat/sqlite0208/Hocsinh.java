package com.ptp.phamtanphat.sqlite0208;

/**
 * Created by KhoaPhamPC on 15/9/2017.
 */

public class Hocsinh {
    private int Id;
    private String Ten;
    private int Namsinh;
    private String Diadiem;

    public Hocsinh(int id, String ten, int namsinh, String diadiem) {
        Id = id;
        Ten = ten;
        Namsinh = namsinh;
        Diadiem = diadiem;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getNamsinh() {
        return Namsinh;
    }

    public void setNamsinh(int namsinh) {
        Namsinh = namsinh;
    }

    public String getDiadiem() {
        return Diadiem;
    }

    public void setDiadiem(String diadiem) {
        Diadiem = diadiem;
    }
}
