 /**  ʹ�ö�ά�����ѭ��ʵ����������Ϸ���̵Ļ��� */
 import java.util.Arrays;
 public class task5{
	 public static void main(String[] args){
		 int[][] arr2 = new int[17][17];
		 int[] arr1 = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		 //��������ά���鸳ֵ
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
		 //���������ά����Ԫ��
		for(int i=0; i<17;i++){
			for(int j=0; j<17;j++){
				if(arr2[i][j] == -2){
					System.out.print(" ");
				}else if(arr2[i][j] == -1){
					System.out.print("+");
				}
				else{
					//��11��15��a��fһһ��Ӧ
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