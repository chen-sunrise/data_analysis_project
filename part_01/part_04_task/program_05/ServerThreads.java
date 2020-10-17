package com.lagou.housework02;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class ServerThreads extends Thread {
    private Socket s;

    @Override
    public void run() {
        BufferedReader br = null;
        PrintStream ps = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            ps = new PrintStream(s.getOutputStream());
            oos = new ObjectOutputStream(new ObjectOutputStream(s.getOutputStream()));
            ois = new ObjectInputStream(s.getInputStream());

            while (true) {
                String s1 = br.readLine();
                if (s1.equalsIgnoreCase("message")){
                    String str1 = br.readLine();
                    InetAddress inetAddress = s.getInetAddress();
                    System.out.println("客户端" + inetAddress + "发过来的消息内容是：" + str1);
                    if ("bye".equalsIgnoreCase(str1)) {
                        System.out.println("客户端" + inetAddress + "已下线！");
                        break;
                    }
                    ps.println("I received!");
                    System.out.println("服务器发送数据成功！");
                    ps.println(str1);
                }
                else if (s1.equalsIgnoreCase("file")){
                    Object fileInfoObj = ois.readObject();
                    ps.println("I received!");
                    System.out.println("服务器发送数据成功！");
                    oos.writeObject(fileInfoObj);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (null != br){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != ps){
                ps.close();
            }
            if (null != oos){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != ois){
                try {
                    ois.close();
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
