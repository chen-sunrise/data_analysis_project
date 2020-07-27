 /**  使用二维数组和循环实现五子棋游戏棋盘的绘制 */
 import java.util.Arrays;
 public class task5{
	 public static void main(String[] args){
		 int[][] arr2 = new int[17][17];
		 int[] arr1 = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		 //遍历给二维数组赋值
		 for(int i=0; i<17;i++){
			 for(int j=0; j<17;j++){
				 if(i == 0 && j == 0){
					 arr2[i][j] = -2;
				 }
				 else if(i == 0){
					 arr2[i][j] = arr1[j-1];
				 }
				 else if(j == 0){
					 arr2[i][j] = arr1[i-1];
				 }
				 else{
					 arr2[i][j] = -1;
				 }
			 }
		 }
		 //遍历输出二维数组元素
		for(int i=0; i<17;i++){
			for(int j=0; j<17;j++){
				if(arr2[i][j] == -2){
					System.out.print(" ");
				}else if(arr2[i][j] == -1){
					System.out.print("+");
				}
				else{
					//将11到15和a到f一一对应
					if(arr2[i][j] == 15) System.out.print("f");
					else if(arr2[i][j] == 14) System.out.print("e");
					else if(arr2[i][j] == 13) System.out.print("d");
					else if(arr2[i][j] == 12) System.out.print("c");
					else if(arr2[i][j] == 11) System.out.print("b");
					else if(arr2[i][j] == 10) System.out.print("a");
					else System.out.print(arr2[i][j]);
				}
				System.out.print("  ");
			}
			System.out.println();
		}
	 }
 }