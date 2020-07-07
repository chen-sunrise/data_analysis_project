 // 测试
 import java.util.Arrays;
 public class arrayToString{
	 public static void main(String[] args){
		 int[] arr = {10,20,30,40,50};
		 System.out.println(Arrays.toString(arr));
		 int[] arr1 = new int[5];
		 System.out.println(Arrays.toString(arr1));
		 // 用10填充arr1数组
		 Arrays.fill(arr1,10);
		 System.out.println(Arrays.toString(arr1));
		 int[] arr2 = new int[5];
		 Arrays.fill(arr2,10);
		 System.out.println(Arrays.equals(arr1,arr2));
	 }
 }