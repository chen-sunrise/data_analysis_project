package com.lagou.housework02;

import java.io.*;
import java.util.LinkedList;
import java.util.List;


public class MulThreadingCopyTest implements Runnable{
    public static void main(String[] args) {
        String fileName = "C:/Users/Administrator/Desktop/test";
        String writeFilePath = "C:/Users/Administrator/Desktop/test1";
        File file = new File(fileName);
        List<String> filePaths = getDirFilePath(file);
        for (String filePath: filePaths) {
            copyFile(filePath,writeFilePath);
        }

    }
	
	// 拷贝文件内容到另一个文件中
    public static void copyFile(String filePath, String writeFilePath){
		// filePath：读取的文件路径
		// writeFilePath：写入的文件路径
        Object fileInfo = getFileInfo(filePath);
        writeFileInfo(fileInfo, writeFilePath);
    }
	// 获取指定文件夹下的文件路径
    public static List<String> getDirFilePath(File file){
        File[] fileArrays = file.listFiles();
        List<String> lt1 = new LinkedList<>();
        for (File tf: fileArrays) {
            if (tf.isFile()){
                lt1.add(tf.getAbsolutePath());
            }
            if (tf.isDirectory()){
                getDirFilePath(tf);
            }
        }
        return lt1;
    }
	// 获取指定文件的内容
    public static Object getFileInfo(String filePath){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(filePath));
            Object lt = ois.readObject();
            return lt;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (null != ois) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
	// 往指定文件中写入数据
    public static void writeFileInfo(Object lt, String filePath){
		// lt: 需要写入文件的对象
		// filePath: 需要写入数据的文件路径
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(filePath));
            oos.writeObject(lt);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != oos){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void run() {

    }
}
