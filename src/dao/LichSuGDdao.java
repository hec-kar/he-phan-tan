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
import java.util.Date;
import models.LichSuGiaoDich;

/**
 *
 * @author Ngo Tien Phong
 */
public class LichSuGDdao {
    public ArrayList<LichSuGiaoDich> getDSDGBySTK(String stk) throws SQLException {
        ArrayList<LichSuGiaoDich> dsgd = new ArrayList<>();
        String query = "select * from LichSuGiaoDich where SoTaiKhoan = ?";
        PreparedStatement cmd = Connect.cn.prepareStatement(query);
        cmd.setString(1, stk);
        ResultSet rs = cmd.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("Id");
            Date ngayRutTien = rs.getDate("NgayRutTien");
            int soTienRut = rs.getInt("SoTienRutRa");
            String sotaikhoan = rs.getString("SoTaiKhoan");
            dsgd.add(new LichSuGiaoDich(id, ngayRutTien, soTienRut, sotaikhoan));
        } rs.close();
        return dsgd;
    }
    
}
