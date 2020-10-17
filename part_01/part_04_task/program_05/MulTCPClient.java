package com.lagou.housework02;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class MulTCPClient {
    public static void main(String[] args) {
        Socket s = null;
        Scanner sc = null;
        BufferedReader br = null;
        PrintStream ps = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        
        try {
            s = new Socket("127.0.0.1",8888);
            System.out.println("连接服务器成功");

            sc = new Scanner(System.in);
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            ps = new PrintStream(s.getOutputStream());
            oos = new ObjectOutputStream(s.getOutputStream());
            ois = new ObjectInputStream(s.getInputStream());

            while (true) {
                System.out.println("请选择向服务器发送的数据类型：\n1.消息\n2.文件");
                int chooseNumber = sc.nextInt();

                if (chooseNumber == 1) {
                    ps.println("message");
                    System.out.println("请输入要发送的消息：");
                    String str1 = sc.next();
                    ps.println(str1);
                    if ("bye".equalsIgnoreCase(str1)){
                        System.out.println("聊天结束！");
                        break;
                    }
                } else if (chooseNumber == 2) {
                    ps.println("file");
                    System.out.println("请输入文件路径：");
                    String filePath = sc.next();
                    Object fileInfoObj = getFileInfo(filePath);
                    oos.writeObject(fileInfoObj);
                }
                System.out.println("向服务器发送消息成功");
                
                
                String str2 = br.readLine();
                if ("message".equalsIgnoreCase(str2)){
                    String messageInfo = br.readLine();
                    System.out.println("服务回发的消息是：" + messageInfo);
                }
                else if ("file".equalsIgnoreCase(str2)){
                    Object fileInfoObj = ois.readObject();
                    System.out.println("服务器回发的文件内容是：" + fileInfoObj);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (null != sc) {
                sc.close();
            }
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != ps) {
                ps.close();
            }
            if (null != ois) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != oos) {
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
        }
    }
    public static Object getFileInfo(String filePath){
        ObjectInputStream ois = null;
        Object fileObj = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(filePath));
            fileObj = ois.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (null != ois){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return fileObj;
    }
}
