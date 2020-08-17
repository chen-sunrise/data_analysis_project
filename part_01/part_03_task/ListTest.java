package com.lagou.housework01;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListTest {
    public static void main(String[] args) {
        List<Student> lt1 = new LinkedList<>();
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        int functionNum;
        System.out.println("---------------------------");
        System.out.println("----------学生系统----------");
        System.out.println("输入下列数字（数字对应功能）：");
        System.out.println("0:进入学生系统");
        System.out.println("1:添加学生信息");
        System.out.println("2:修改学生信息");
        System.out.println("3:获取学生信息");
        System.out.println("4:删除学生信息");
        System.out.println("5:退出学生系统");
        System.out.println("---------------------------");
        while(flag){
            functionNum = sc.nextInt();
            if (0 == functionNum){
                System.out.println("---------------------------");
                System.out.println("--------欢迎进入学生系统-----");
            }
            else if (1 == functionNum){
                System.out.println("请依次输入：学号、姓名、年龄");
                System.out.println("请输入学号:");
                int studentId = sc.nextInt();
                System.out.println("请输入姓名:");
                String name = sc.next();
                System.out.println("请输入年龄:");
                int age = sc.nextInt();
                addStudentsInfo(lt1,studentId,name,age);
                System.out.println("---------------------------");
            }
            else if(2 == functionNum){
                System.out.println("请依次输入：学号、姓名、年龄");
                System.out.println("请输入学号:");
                int studentId = sc.nextInt();
                System.out.println("请输入姓名:");
                String name = sc.next();
                System.out.println("请输入年龄:");
                int age = sc.nextInt();
                updateStudentsInfo(lt1,studentId,name,age);
                System.out.println("---------------------------");
            }
            else if(3 == functionNum){
                getAllStudentsInfo(lt1);
                System.out.println("---------------------------");
            }
            else if(4 == functionNum){
                System.out.println("请依次输入：学号、姓名、年龄");
                System.out.println("请输入学号:");
                int studentId = sc.nextInt();
                System.out.println("请输入姓名:");
                String name = sc.next();
                System.out.println("请输入年龄:");
                int age = sc.nextInt();
                deleteStudentsInfo(lt1,studentId,name,age);
                System.out.println("---------------------------");
            }
            else if(5 == functionNum){
                flag = false;
                System.out.println("---------退出学生系统-------");
            }
        }
    }
    private static void addStudentsInfo(List<Student> lt, int studentId, String name, int age){
        lt.add(new Student(studentId, name, age));
        System.out.println("添加成功");
    }
    private static void getStudentsInfo(List<Student> lt){
        System.out.println("当前学生信息为：" + lt);
    }
    private static void updateStudentsInfo(List<Student> lt, int studentId, String name, int age){
        Student stu = new Student(studentId,name,age);
        int index = lt.indexOf(stu);
        if (StudentInfoState(lt,stu)){
            lt.set(index, stu);
            System.out.println("修改成功");
        }
        else {
            System.out.println("该学生信息不存在！");
        }
    }
    private static void deleteStudentsInfo(List<Student> lt, int studentId, String name, int age){
        Student stu = new Student(studentId,name,age);
        if (lt.contains(stu)){
            lt.remove(stu);
            System.out.println("删除成功");
        }
        else {
            System.out.println("该学生信息不存在！");
        }
    }
    private static boolean StudentInfoState(List<Student> lt, Student stu){
        return lt.contains(stu);
    }
    private static void getAllStudentsInfo(List<Student> lt){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < lt.size(); i++){
            if (lt.size()-1 == i) {
                sb.append("]");
            }
            else {
                Student obj = lt.get(i);
                sb.append(obj).append(",").append("]");
            }
        }
        System.out.println("所有学生信息为:" + sb);
    }
}
