 /** 
 自定义数组扩容规则，当已存储元素数量达到总容量的 80%时，扩容 1.5 倍。 
 例如，总容量是 10，当输入第 8 个元素时，数组进行扩容，容量从 10 变 15
 */
 import java.util.Scanner;
 import java.util.Arrays;
 public class task4{
	 public static void main(String[] args){
		 System.out.println("请输入一个1~100之间的整数（该整数位数组长度）：");
		 Scanner sc = new Scanner(System.in);
		 int arrNum = sc.nextInt();
		 int[] arr = new int[arrNum];
		 System.out.println("请输入一个1~150之间的整数：");
		 int arr2Num = sc.nextInt();
		 int arrLen = arr.length;
		 for(int i = 1; i<=arr2Num; i++){
			 arr[i] = i;
			 //arrLen*0.8位double类型，需要强制转换为int类型
			 if(i == (int)(arrLen * 0.8)){
				 int[] brr = new int[(int)(arrLen * 1.5)];
				 //将arr数组元素复制到brr数组上
				 System.arraycopy(arr,0,brr,0,arrLen);
				 System.out.println(Arrays.toString(brr));
			 }
		 }
	 }
 }