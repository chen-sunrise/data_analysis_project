package com.lagou.housework02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket s = null;
        ObjectInputStream ois = null;
        InputStream ins = null;
        OutputStream ops = null;
        ObjectOutputStream oos = null;

        try {
            // 创建ServerSocket
            ss = new ServerSocket(8888);
            System.out.println("等待客户端连接！");

            // 等待客户端连接
            s = ss.accept();
            System.out.println("客户端连接成功！");

            // 初始化I/O
            ins = s.getInputStream();
            ois = new ObjectInputStream(ins);
            ops = s.getOutputStream();
            oos = new ObjectOutputStream(ops);

            // 接收客户端发送过来的信息
            UserMessage usermessage = (UserMessage) ois.readObject();
            System.out.println("客户端发送的用户名：" + usermessage.getUser().getUsername());
            System.out.println("客户端发送的密码：" + usermessage.getUser().getPassword());

            // 校验客户端的用户信息是否正确，并返回校验结果
            if ("admin".equals(usermessage.getUser().getUsername()) &&
                    "123456".equals(usermessage.getUser().getPassword())) {
                usermessage.setType("success");
            } else {
                usermessage.setType("fail");
            }
            oos.writeObject(usermessage);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (null != ins) {
                try {
                    ins.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if ( null != ops){
                try {
                    ops.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != ois) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != oos){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != s) {
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != ss) {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
