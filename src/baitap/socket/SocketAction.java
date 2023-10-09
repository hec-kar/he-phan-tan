/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.socket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author ngoti
 */
public class SocketAction {
    ServerSocket sserver;
    public void connectPort(int port) throws Exception {
        sserver = new ServerSocket(port);
        InetAddress localHost = InetAddress.getLocalHost();
        
        System.out.println("dia chi: " +  localHost.getHostAddress() +
                ":" + port);
    }
    
    public String receiveMessage() throws Exception {
        Socket sk = sserver.accept();
        InputStreamReader inputStream = new InputStreamReader(sk.getInputStream());
        BufferedReader buffer = new BufferedReader(inputStream);
        return buffer.readLine();
    }
    
    
    public  void sendMessage(String data,String host, int port) throws Exception {
        Socket sk = new Socket(host, port);
        DataOutputStream out = new DataOutputStream(sk.getOutputStream());
        out.writeBytes(data);
        out.write(13);
        out.write(10);
        out.close();
    }
}
