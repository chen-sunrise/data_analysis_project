package com.lagou.housework;

import java.util.Scanner;
public class FiveCheseGameTest {
    public static void main(String[] args) {
        int x,y;
        FiveCheseGame fcg = new FiveCheseGame();

        // flag为true为白方
        // flag为false为黑方
        boolean flag = true;
        boolean flag1 = true;

        Scanner sc = new Scanner(System.in);
        while(flag1){
            if (flag) {
                System.out.println("白方请输入要落子的横坐标和纵坐标：");
            } else {
                System.out.println("黑方请输入要落子的横坐标和纵坐标：");
            }

            // 获取用户输入的x、y轴的值
            x = sc.nextInt();
            y = sc.nextInt();
            fcg.setX(x);
            fcg.setY(y);

            // 判断当前位置是否已经有棋子
            if(!fcg.getState(x,y)) continue;

            if (flag){

                // 设置落棋点位白色
                int WHITE = FiveCheseGame.getWHITE();
                fcg.setArray(x,y,WHITE);

                // 判断白方是否获胜，获胜则退出循环
                flag1 = !fcg.checkSuccessful(x,y,WHITE);
                if(!flag1) System.out.println("白方获胜！");
            }
            else {

                // 设置落棋点位黑色
                int BLACK = FiveCheseGame.getBLACK();
                fcg.setArray(x,y,BLACK);

                // 判断黑方是否获胜，获胜则退出循环
                flag1 = !fcg.checkSuccessful(x,y,BLACK);
                if(!flag1) System.out.println("黑方获胜！");
            }

            // 转换执棋方
            flag = !flag;

            // 显示棋盘
            fcg.showChess();
        }

    }
}
