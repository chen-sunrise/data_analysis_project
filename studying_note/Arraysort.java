/*import java.util.Arrays;
public class Arraysort{
	public static void main(String[] args){
		int[] arr = {3,2,5,6,1};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr,9));
		System.out.println(Arrays.binarySearch(arr,2));
	}
}*/
//杨辉三角

import java.util.Scanner;
public class Arraysort{
	public static void main(String[] args){
		System.out.println("请输入一个行数：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] arr = new int[num][];
		for(int i = 0;i < num; i++){
			arr[i] = new int[i+1];
			for(int j = 0;j <= i;j++){
				if(0 == j || i == j){
					arr[i][j] = 1;
				}else{
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
			}
		}
		for(int i = 0;i < num; i++){
			for(int j = 0; j <= i; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}