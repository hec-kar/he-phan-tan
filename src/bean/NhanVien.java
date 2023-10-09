/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Date;

/**
 *
 * @author Ngo Tien Phong
 */
public class NhanVien {
    private String manv;
    private String hoten;
    private boolean gioitinh;
    private Date ngaysinh;
    private float hsl;
    private String madv;

    public NhanVien() {
    }

    public NhanVien(String manv, String hoten, boolean gioitinh, Date ngaysinh, float hsl, String madv) {
        this.manv = manv;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.hsl = hsl;
        this.madv = madv;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public float getHsl() {
        return hsl;
    }

    public void setHsl(float hsl) {
        this.hsl = hsl;
    }

    public String getMadv() {
        return madv;
    }

    public void setMadv(String madv) {
        this.madv = madv;
    }

    @Override
    public String toString() {
        return  "NV:" + this.manv + "|" + this.hoten+ "|" +  this.hsl;
    }
    
}
