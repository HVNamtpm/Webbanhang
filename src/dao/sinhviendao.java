/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.sinhvienbean;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author thegi
 */
public class sinhviendao {
     public int Themsv(String masv, String hoten, Date ngaysinh, String gioitinh,Float dtb, String makhoa) throws Exception{
        //B1 Thiet lap cau lenh sql
        String sql="insert into sinhvien(masv,hoten,ngaysinh,gioitinh,dtb,makhoa) values (?,?,?,?,?,?)";
        //b2: tao cau lenh
        PreparedStatement cmd= DungChung.cn.prepareStatement(sql);
        cmd.setString(1, masv);
        cmd.setString(2, hoten);
        cmd.setDate(3, ngaysinh);
        cmd.setString(4, gioitinh);
        cmd.setFloat(5, dtb);
        cmd.setString(6, makhoa);
        //b3: Thuc hien cau lenh
        return cmd.executeUpdate();
    }
    public int Xoanv(String masv) throws Exception{
        //B1 Thiet lap cau lenh sql
        String sql="delete from SINHVIEN where masv = ?";
        //b2: tao cau lenh
        PreparedStatement cmd= DungChung.cn.prepareStatement(sql);
        cmd.setString(1, masv);
        //b3: Thuc hien cau lenh
        return cmd.executeUpdate();
    }  
    public int Suanv(String masv, String hoten, Date ngaysinh, String gioitinh,Float dtb, String makhoa) throws Exception{
        //B1 Thiet lap cau lenh sql
        String sql="update SINHVIEN set hoten = ?,ngaysinh=?,gioitinh=?,dtb=?,makhoa=? where masv = ?";
        //b2: tao cau lenh
        PreparedStatement cmd= DungChung.cn.prepareStatement(sql);
        cmd.setString(1, masv);
        cmd.setString(2, hoten);
        cmd.setDate(3, ngaysinh);
        cmd.setString(4, gioitinh);
        cmd.setFloat(5, dtb);
        cmd.setString(6, makhoa);
        //b3: Thuc hien cau lenh
        return cmd.executeUpdate();
    }
    
     
    public  ArrayList<sinhvienbean> getSinhVien(String mak) throws Exception{
       ArrayList<sinhvienbean> ds=new ArrayList<>();
       //lay all bang don vi luu vao ds
       //b1 thiet lap cau lenh sql
       String sql ="select * from sinhvien where makhoa =?";
       //b2 tao cau lenh
        PreparedStatement cmd = DungChung.cn.prepareStatement(sql);
          cmd.setString(1,mak);
        //b3 thuc hien cau len
        ResultSet rs = cmd.executeQuery();
        //b4 duyet qua rs
        while(rs.next())
        {
            String masv = rs.getString("masv");
            String hoten = rs.getString("hoten");
            Date ngaysinh = rs.getDate("ngaysinh");
            String gioitinh = rs.getString("gioitinh");
            Float dtb = rs.getFloat("dtb");
            String makhoa = rs.getString("makhoa");
            sinhvienbean dv = new sinhvienbean(masv, hoten, ngaysinh, gioitinh, dtb, makhoa);
            ds.add(dv);//Luu dv vao mang ds
        }
        return ds;
    }
     
    
}
