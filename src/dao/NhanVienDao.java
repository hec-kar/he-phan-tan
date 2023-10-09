/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.NhanVien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Ngo Tien Phong
 */
public class NhanVienDao {

    /**
     *
     * @param madv
     * @return
     * @throws Exception
     */
    static public ArrayList<NhanVien> timTheoMaDv (String madv) throws Exception {
        ArrayList<NhanVien> dsnv = new ArrayList<NhanVien>();
        String query = "select manv, hoten,gioitinh ,hsl from nhanvien where madv = ?";
        PreparedStatement cmd = Connect.cn.prepareStatement(query);
        cmd.setString(1, madv);
        ResultSet rs = cmd.executeQuery();
        while (rs.next()) {
            String manv = rs.getString("manv");
            String hoten = rs.getString("hoten");
            float hsl = rs.getFloat("hsl");
            boolean gt = rs.getBoolean("gioitinh");
            dsnv.add(new NhanVien(manv, hoten, gt, null, hsl, madv));
        }
        rs.close();
        return dsnv;
    }
}