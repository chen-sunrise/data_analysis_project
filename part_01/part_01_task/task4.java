 /** 
 �Զ����������ݹ��򣬵��Ѵ洢Ԫ�������ﵽ�������� 80%ʱ������ 1.5 ���� 
 ���磬�������� 10��������� 8 ��Ԫ��ʱ������������ݣ������� 10 �� 15
 */
 import java.util.Scanner;
 import java.util.Arrays;
 public class task4{
	 public static void main(String[] args){
		 System.out.println("������һ��1~100֮���������������λ���鳤�ȣ���");
		 Scanner sc = new Scanner(System.in);
		 int arrNum = sc.nextInt();
		 int[] arr = new int[arrNum];
		 System.out.println("������һ��1~150֮���������");
		 int arr2Num = sc.nextInt();
		 int arrLen = arr.length;
		 for(int i = 1; i<=arr2Num; i++){
			 arr[i] = i;
			 //arrLen*0.8λdouble���ͣ���Ҫǿ��ת��Ϊint����
			 if(i == (int)(arrLen * 0.8)){
				 int[] brr = new int[(int)(arrLen * 1.5)];
				 //��arr����Ԫ�ظ��Ƶ�brr������
				 System.arraycopy(arr,0,brr,0,arrLen);
				 System.out.println(Arrays.toString(brr));
			 }
		 }
	 }
 }