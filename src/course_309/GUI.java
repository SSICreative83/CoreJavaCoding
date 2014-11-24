/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_309_practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import javax.swing.*;
import java.net.Socket;
/**
 *
 * @author huijun
 */
public class GUI {
    private JFrame window = new JFrame("OrderEntry Program");
    private JButton orderButton = new JButton("Order"); 
    
    
    public static void main(String[] args) throws IOException{
        Socket s = new Socket("128.133.27.8", 1234);
        DataInputStream  dis = new DataInputStream (s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeUTF("How are you today?");
        String reply = dis.readUTF();  // wait for server to send
    
        ServerSocket ss = new ServerSocket(1234);
        Socket s2 = ss.accept();  // wait for a client to connect
    }
}
