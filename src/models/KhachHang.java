/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Ngo Tien Phong
 */
public class KhachHang {
    private String soTaiKhoan;
    private String hoTen;
    private String soDienThoai;
    private String soCMND;
    private int soTien;

    public KhachHang() {
    }

    public KhachHang(String soTaiKhoan, String hoTen, String soDienThoai, String soCMND, int soTien) {
        this.soTaiKhoan = soTaiKhoan;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.soCMND = soCMND;
        this.soTien = soTien;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public int getSoTien() {
        return soTien;
    }

    public void setSoTien(int soTien) {
        this.soTien = soTien;
    }
    
    @Override
    public String toString() {
        return "kh:" + this.hoTen + "|" + this.soTien;
    }
}
