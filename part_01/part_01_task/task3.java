/*实现双色球抽奖游戏中奖号码的生成，中奖号码由 6 个红球号码和 1 个蓝球号码组成。 
其中红球号码要求随机生成 6 个 1~33 之间不重复的随机号码。 
其中蓝球号码要求随机生成 1 个 1~16 之间的随机号码。*/
import java.util.Random;
import java.util.Arrays;
public class task3{
	public static void main(String[] args){
		Random r = new Random(1);
		int number = 0;
		int[] arr = new int[7];
		//获取6个1~33 之间不重复的随机红色号码
		for(int i = 0; i < 6; i++){
			int red = r.nextInt(33);
			arr[i] = red;
			//System.out.println(red);	
		}
		//获取1 个 1~16 之间的随机蓝色号码
		int blue = r.nextInt(16);
		arr[6] = blue;
		//打印数字内容
		//System.out.println(Arrays.toString(arr));
		StringBuffer str = new StringBuffer();
		//循环数组，并将数组整数元素进行拼接
		for(int i=0;i<arr.length;i++){
			str.append(arr[i]);
		}
		System.out.println("双色球抽奖游戏中奖号码为：" + str);
	}
}