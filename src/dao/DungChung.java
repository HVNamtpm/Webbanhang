/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author thegi
 */
public class DungChung {
    public static Connection cn;
     public void KetNoi(String tenmc, String csdl, String un, String pass) throws Exception{
        //b1: Xac dinh dinh duoc HQTCSDL
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        System.out.println("Da xac dinh HQTCSDL");
        //b2: kết nối vào csdl
        String url="jdbc:sqlserver://"+tenmc+":1433;databaseName="+ csdl+";user="+un+"; password="+pass;
        cn=DriverManager.getConnection(url);
        System.out.println("Da Ket noi vao CSDL");
    }
     public ResultSet getBang(String tb) throws Exception{
         //B1: tạo câu lệnh sql
         String sql="select * from "+ tb;
         //B2: tạo câu lệnh
         PreparedStatement cmd = cn.prepareStatement(sql);
         //B3: thực hiện câu lệnh
         ResultSet rs = cmd.executeQuery();
         return rs;
     }
    
    
}
