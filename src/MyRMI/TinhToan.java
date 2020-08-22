/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyRMI;

import bean.khoabean;
import bean.sinhvienbean;
import dao.khoadao;
import dao.sinhviendao;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author thegi
 */
public class TinhToan extends UnicastRemoteObject implements ITinhToan{
    public  TinhToan() throws Exception{}
    khoadao k = new khoadao();
     sinhviendao sv=new sinhviendao();
 
    @Override
    public ArrayList<khoabean> getKhoa() throws Exception {
         return k.getKhoa();
    }

    @Override
    public int Themsv(String masv, String hoten, Date ngaysinh, String gioitinh, Float dtb, String makhoa) throws Exception {
        return sv.Themsv(masv, hoten, ngaysinh, gioitinh, dtb, makhoa);   }

    @Override
    public int Suanv(String masv, String hoten, Date ngaysinh, String gioitinh, Float dtb, String makhoa) throws Exception {
         return sv.Suanv(masv, hoten, ngaysinh, gioitinh, dtb, makhoa);    }

    @Override
    public int Xoanv(String masv) throws Exception {
          return sv.Xoanv(masv);  
    }
     ArrayList<sinhvienbean> ds;
    @Override
    public ArrayList<sinhvienbean> timSinhVien(String key) throws Exception {
       
     ArrayList<sinhvienbean> tam = new ArrayList<sinhvienbean>();
       
        for(sinhvienbean sv : ds)
            if(sv.getHoten().trim().toLowerCase().contains(key.toLowerCase().trim()))
                tam.add(sv);
        return tam;
    }
     ArrayList<khoabean> dsk;
    @Override
    public ArrayList<khoabean> timKhoa(String key) throws Exception {
        ArrayList<khoabean> tam = new ArrayList<khoabean>();
        for(khoabean sv : dsk)
            if(sv.getTenkhoa().trim().toLowerCase().contains(key.toLowerCase().trim()))
                tam.add(sv);
        return tam;
    }

    @Override
    public ArrayList<sinhvienbean> getSinhVien(String mak) throws Exception {
       return sv.getSinhVien(mak) ; 
    }
    
}
