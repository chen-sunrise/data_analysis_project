package com.lagou.housework02;

import com.lagou.task19.ServerThread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MulTCPServer {
    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket s = null;
        try {
            ss = new ServerSocket(8888);
            System.out.println("等待客户端连接");
            s = ss.accept();
            System.out.println("客户端" + s.getInetAddress() +"连接成功!");
            new ServerThread(s).start();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != ss){
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
