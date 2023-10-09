/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket.csdl;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Ngo Tien Phong
 */
public class GuiNhan {
    ServerSocket sserver;
    public void MoCong(int port) throws Exception {
        sserver  = new ServerSocket(port);
        System.out.println("Da mo cong" + port);
    }
    public String NhanDuLieu() throws Exception {
        Socket sk = sserver.accept();
        InputStreamReader is = new InputStreamReader(sk.getInputStream(), StandardCharsets.UTF_8);
        BufferedReader r = new BufferedReader(is);
        
        return r.readLine();
    }
    
    public void GuiDuLieu(String data, String ipClient, int port) throws Exception {
        Socket sk = new Socket(ipClient, port);
        DataOutputStream out = new DataOutputStream(sk.getOutputStream());
        out.writeBytes(data);
        out.write(13);
        out.write(10); // 10 va 13 la ma enter
        out.close();
    }
}
