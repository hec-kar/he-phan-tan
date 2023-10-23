
import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ngo Tien Phong
 */
public class MyServer {
    public static void main(String[] args)  {
        try {
            TinhToan tt = new TinhToan();
            UnicastRemoteObject.exportObject(tt);
            Naming.bind("rmi://localhost/TinhToan", tt);
            System.out.println("Dang ky cho may khach goi den!!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
                
    }
}
