package com.lagou.housework;

public class ArrayDoublePrint {
    public static void main(String[] args) {
        int[][] arr2 = new int[16][16];
        // 赋值二维数组元素
        for (int i = 0; i < 16; i++){
            for (int j = 0; j < 16; j++){
                arr2[i][j] = i + j;
            }
        };
        // 累加每行的元素并输出
        for (int i = 0; i < 16; i++){
            int sum = 0;
            for (int j = 0; j < 16; j++){
                sum += arr2[i][j];
            }
            System.out.println("第" + (i+1) +"行所有数累加为：" + sum);
        };
        // 累加每列的元素并输出
        for (int j = 0; j < 16; j++){
            int count = 0;
            for (int i = 0; i < 16; i++){
                count += arr2[i][j];
            }
            System.out.println("第" + (j+1) +"列所有数累加为：" + count);
        }
        int count1 = 0;
        // 累加矩阵对角线上的元素
        for (int j = 0; j < 16; j++){
            for (int i = 0; i < 16; i++){
                if(i == j)
                {
                    count1 += arr2[i][j];
                }
                if(16 == i + j){
                    count1 += arr2[i][j];
                }
            }
        }
        System.out.println("对角线所有数累加为：" + count1);
    }
}
