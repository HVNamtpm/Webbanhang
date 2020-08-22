/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author thegi
 */
public class sinhvienbean  implements Serializable{
    String masv;
    String hoten;
    Date ngaysinh;
    String gioitinh;
    Float dtm;
    String makhoa;

    public sinhvienbean() {
    }

    public sinhvienbean(String masv, String hoten, Date ngaysinh, String gioitinh, Float dtm, String makhoa) {
        this.masv = masv;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.dtm = dtm;
        this.makhoa = makhoa;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Float getDtm() {
        return dtm;
    }

    public void setDtm(Float dtm) {
        this.dtm = dtm;
    }

    public String getMakhoa() {
        return makhoa;
    }

    public void setMakhoa(String makhoa) {
        this.makhoa = makhoa;
    }
    
    
    
}
