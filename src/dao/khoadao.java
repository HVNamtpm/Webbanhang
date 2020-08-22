/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.khoabean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author thegi
 */
public class khoadao {
      public  ArrayList<khoabean> getKhoa() throws Exception{
       ArrayList<khoabean> ds=new ArrayList<>();
       //lay all bang don vi luu vao ds
       //b1 thiet lap cau lenh sql
       String sql ="select * from KHOA";
       //b2 tao cau lenh
        PreparedStatement cmd = DungChung.cn.prepareStatement(sql);
        //b3 thuc hien cau len
        ResultSet rs = cmd.executeQuery();
        //b4 duyet qua rs
        while(rs.next())
        {
            String makhoa = rs.getString("makhoa");
            String tenkhoa = rs.getString("tenkhoa");
            khoabean dv = new khoabean(makhoa, tenkhoa);
            ds.add(dv);//Luu dv vao mang ds
        }
        return ds;
    }
    
}
