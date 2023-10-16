/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author Ngo Tien Phong
 */
public class LichSuGiaoDich {
    private int id;
    private Date ngayRutTien;
    private int soTienRutRa;
    private String soTaiKhoan;

    public LichSuGiaoDich() {
    }

    public LichSuGiaoDich(int id, Date ngayRutTien, int soTienRutRa, String soTaiKhoan) {
        this.id = id;
        this.ngayRutTien = ngayRutTien;
        this.soTienRutRa = soTienRutRa;
        this.soTaiKhoan = soTaiKhoan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getNgayRutTien() {
        return ngayRutTien;
    }

    public void setNgayRutTien(Date ngayRutTien) {
        this.ngayRutTien = ngayRutTien;
    }

    public int getSoTienRutRa() {
        return soTienRutRa;
    }

    public void setSoTienRutRa(int soTienRutRa) {
        this.soTienRutRa = soTienRutRa;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }
    
    @Override
    public String toString() {
        return  "ls:" + this.ngayRutTien + "|" + this.soTienRutRa;
    }
}
