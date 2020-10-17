package com.lagou.housework02;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) {
        Socket s = null;
        OutputStream ops = null;
        ObjectOutputStream oos = null;
        InputStream ins = null;
        ObjectInputStream ois = null;
        Scanner sc = null;

        User user = new User();
        UserMessage usermessage = new UserMessage();
        usermessage.setType("check");
        try {
            // 连接服务器
            s = new Socket("127.0.0.1",8888);
            System.out.println("服务器连接成功！");

            // 初始化I/O
            ins = s.getInputStream();
            ops = s.getOutputStream();
            oos = new ObjectOutputStream(ops);
            ois = new ObjectInputStream(ins);
            sc = new Scanner(System.in);

            // 组织发送信息
            System.out.println("请输入用户名和密码：");
            String username = sc.next();
            String password = sc.next();
            user.setUsername(username);
            user.setPassword(password);
            usermessage.setUser(user);

            // 给服务器发送消息
            System.out.println("客户端发送的消息是：" + usermessage);
            oos.writeObject(usermessage);

            // 接收服务器回复的信息,并校验回复结果
            UserMessage receiveObj = (UserMessage) ois.readObject();
            System.out.println("服务器回复的消息:" + receiveObj.getType());
            if ("success".equals(receiveObj.getType())) {
                System.out.println("登录成功！");
            } else {
                System.out.println("登录失败！");
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (null != sc) {
                sc.close();
            }
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
            if (null != s){
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

