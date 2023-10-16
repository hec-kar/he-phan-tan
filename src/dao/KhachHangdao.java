/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.KhachHang;

/**
 *
 * @author Ngo Tien Phong
 */
public class KhachHangdao {
    public ArrayList<KhachHang> findKhachHangByCMND(String cmnd) throws SQLException {
        ArrayList<KhachHang> dskh = new ArrayList<>();
        String query = "select * from KhachHang where SoCMND = ?";
        PreparedStatement cmd = Connect.cn.prepareStatement(query);
        cmd.setString(1, cmnd);
        ResultSet rs = cmd.executeQuery();
        while (rs.next()) {
            String soTaiKhoan = rs.getString("SoTaiKhoan");
            String hoTen = rs.getString("HoTen");
            String soDienThoai = rs.getString("SoDienThoai");
            String soCMND = rs.getString("SoCMND");
            int soTien = rs.getInt("SoTien");
            dskh.add(new KhachHang(soTaiKhoan, hoTen, soDienThoai, soCMND, soTien));
        } rs.close();
        return dskh;
    }
}
