package com.lagou.housework;

public class FiveCheseGame {
    private int x;
    private int y;
    private static final int WHITE = 1;
    private static final int BLACK = 2;

    public static int getWHITE() {
        return WHITE;
    }

    public static int getBLACK() {
        return BLACK;
    }

    int[][] arr2 = new int[17][17];
    public FiveCheseGame() {
    }

    public FiveCheseGame(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        if(x > 16 || x < 0){
            System.out.println("超出棋盘的横向大小");
        }else {
            this.x = x;
        }

    }

    public void setY(int y) {
        if(y > 16 || y < 0){
            System.out.println("超出棋盘纵向的大小");
        }else {
            this.y = y;
        }
    }

    // 判断当前落棋点是否有棋子
    public boolean getState(int x, int y){
        if(arr2[x][y] != 0){
            System.out.println("该地方已经有棋子，请重新输入：");
            return false;
        }else {
            return true;
        }
    }

    // 更新棋盘的数据
    public void setArray(int x, int y, int color){
        if(color == WHITE) {
            arr2[x][y] = WHITE;
        }
        else if(color == BLACK){
            arr2[x][y] = BLACK;
        }
    }

    // 显示棋盘
    public void showChess() {
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 17; j++) {
                if (0 == i && 0 == j) {
                    System.out.print(" ");
                }
                else if (0 == i) {
                    if(j > 10){
                        getNum(j-1);
                    }
                    else System.out.print(j-1);
                }
                else if( 0 == j ){
                    if(i > 10){
                        getNum(i -1);
                    }
                    else System.out.print(i-1);
                }
                else {
                    if(arr2[i][j] == 0) System.out.print("+");
                    else if (WHITE == arr2[i][j])
                    {
                        System.out.print("o");
                    }
                    else if (BLACK == arr2[i][j])
                    {
                        System.out.print("x");
                    }
                }
                System.out.print("  ");
            }
            System.out.println();
        }

    }

    // 判断是否获胜
    public boolean checkSuccessful(int x, int y, int color){
        int count = 1;
        int posX,posY;

        //向左遍历
        for(posY = y - 1; posY > 0 ; posY--) {
            if (arr2[x][posY] == color) {
                count++;
                if(count >= 5){
                    return true;
                }
            }else {
                break;
            }
        }
        //向右遍历
        for(posY = y + 1; posY < 16 ; posY++) {
            if (arr2[x][posY] == color) {
                count++;
                if (count >= 5) {
                    return true;
                }
            }else {
                break;
            }
        }
        count = 1;

        //向上遍历
        for(posX = x - 1; posX > 0 ; posX--) {
            if (arr2[posX][y] == color) {
                count++;
                if(count >= 5){
                    return true;
                }
            }else {
                break;
            }
        }
        //向下遍历
        for(posX = x + 1; posX < 16 ; posX++) {
            if (arr2[posX][y] == color) {
                count++;
                if (count >= 5) {
                    return true;
                }
            }else {
                break;
            }
        }
        count = 1;
        //左斜向上
        posY = y;
        for(posX = x - 1; posX > 0 ; posX--){
            posY = posY - 1;
            if(arr2[posX][posY] == color) {
                count++;
                if(count >= 5){
                    return true;
                }
            }else {
                break;
            }
        }
        //右斜向下
        posY = y;
        for(posX = x + 1; posX < 16 ; posX++){
            posY = posY + 1;
            if(arr2[posX][posY] == color) {
                count++;
                if(count >= 5){
                    return true;
                }
            }else {
                break;
            }
        }
        count = 1;
        //左斜向下
        posY = y;
        for(posX = x - 1; posX > 0 ; posX--){
            posY = posY + 1;
            if(arr2[posX][posY] == color) {
                count++;
                if(count >= 5){
                    return true;
                }
            }else {
                break;
            }
        }
        //右斜向上
        posY = y;
        for(posX = x + 1; posX < 16 ; posX++){
            posY = posY - 1;
            if(arr2[posX][posY] == color) {
                count++;
                if(count >= 5){
                    return true;
                }
            }else {
                break;
            }
        }
        return false;
    }

    private void getNum(int num){
        if (10 == num) System.out.print("a");
        else if (11 == num) System.out.print("b");
        else if (12 == num) System.out.print("c");
        else if (13 == num) System.out.print("d");
        else if (14 == num) System.out.print("e");
        else if (15 == num) System.out.print("f");
    }
}
