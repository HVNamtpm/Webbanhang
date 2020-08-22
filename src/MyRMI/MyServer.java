/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyRMI;

import dao.DungChung;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author thegi
 */
public class MyServer {
    public static void main(String[] args) {
         try{
             DungChung dc = new DungChung();
             dc.KetNoi("DESKTOP-CVM5I0R", "QLSinhVien", "sa", "123");
             TinhToan tt= new TinhToan();
             LocateRegistry.createRegistry(1099); 
     

     //Quang ba doi tuong tt de may khach co the goi phuong thuc trong tt
        //     UnicastRemoteObject.exportObject(tt);
     //Dang ky 1 dia chi de may khach truy cap vao doi tuong tt
             Naming.bind("rmi://127.0.0.1/TinhToan",tt);
     System.out.print("Da cho may khach goi den:");
    }catch(Exception tt){ 
        tt.printStackTrace();
    }    
  }
    
    
}
