package com.lagou.housework02;

import java.io.File;

public class DeleteFileDir {
    public static void main(String[] args) {
        String fileName = "C:/Users/Administrator/Desktop/test";
        deleteAllFile(fileName);

    }

    public static boolean deleteAllFile(String FileName){
        File file = new File(FileName);

        if ( !file.exists() ){  //要删除的文件不存在
            System.out.println("文件"+FileName+"不存在，删除失败！" );
            return false;
        }else{ //要删除的文件存在

            if ( file.isFile() ){ //如果目标文件是文件

                return deleteFile(FileName);

            }else{  //如果目标文件是目录
                return deleteDir(FileName);
            }
        }

    }

    public static boolean deleteDir(String dirName){
        File file = new File(dirName);
        if (!file.exists()) return false;
        File[] filesArrays = file.listFiles();
        for (int i=0; i<filesArrays.length; i++){
            deleteAllFile(filesArrays[i].getAbsolutePath());
        }
        if (file.delete()) System.out.println("删除目录成功");
        return true;
    }

    public static boolean deleteFile(String fileName){
        File file = new File(fileName);
        if (file.exists() && file.isFile()){ // 删除的文件且存在
            file.delete();
            return true;
        }
        else {
            System.out.println("文件"+fileName+"不存在，删除失败！");
            return false;
        }
    }
}
