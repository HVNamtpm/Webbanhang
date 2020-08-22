/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyRMI;

import bean.khoabean;
import bean.sinhvienbean;
import java.rmi.Remote;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author thegi
 */
public interface ITinhToan extends Remote{
    public  ArrayList<sinhvienbean> getSinhVien(String mak) throws Exception;
      public  ArrayList<khoabean> getKhoa() throws Exception;
      public int Themsv(String masv, String hoten, Date ngaysinh, String gioitinh,Float dtb, String makhoa) throws Exception;
      public int Suanv(String masv, String hoten, Date ngaysinh, String gioitinh,Float dtb, String makhoa) throws Exception;
      public int Xoanv(String masv) throws Exception;
       public ArrayList<sinhvienbean> timSinhVien(String key) throws Exception;
        public ArrayList<khoabean> timKhoa(String key) throws Exception;
    
}
