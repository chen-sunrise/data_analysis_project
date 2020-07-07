/*public class doubleTest{
	public static void main(String[] args){
		float f1 = 3.141592f;
		System.out.println(f1);
		long l1 = 13;
		System.out.println(l1);
		}
}*/

/* 
ascii码：0-48 A-65 a-97 空格-32 \n-10

*/


// 逻辑运算符的短路特性，&&只要前面的条件为假，后面的条件就会跳过，不会执行
/*public class doubleTest{
	public static void main(String[] args){
		int a =3;
		int b =4;
		boolean b2 = (++a == 3) && (++b == 4);
		System.out.println("b2 = " + b2);
		System.out.println("a = "+ a);
		System.out.println("b = " + b);
	}
}*/
import  java.util.Scanner;

/*public class doubleTest{
	public static void main(String[] args){
		//int num;
		//System.out.println("请输入一个正整数：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println((num >= 100 && num <= 999) ? "这是一个三位整数" : "这不是一个三位整数");
		
		//byte + byte = int 编译器优化策略，减少两个byte相加溢出的数据丢失
		byte b1 = 10;
		//b1 = b1 + 2; //错误: 不兼容的类型: 从int转换到byte可能会有损失
		b1 =(byte)(b1 + 2);
		System.out.println("b1 = " + b1);
	}
}*/

/*
<< 左移运算符，用于将数据的二进制向左移动，右边使用0补充
>> 右移运算符，用于将数据的二进制向右移动，右边使用符号位补充
>>> 表示逻辑右移运算符，用于将数据的二进制位向右移动，左边使用0补充
*/
//运算符的优先级：()的优先级极高，=的优先级极低，若无法确定优先级，使用()来确定优先级
public class doubleTest{
	public static void main(String[] args){
		byte b1 = 13;
		System.out.println("b1 = " + b1);
		// 右移运算符的运用
		//byte b2 = b1 << 1;
		byte b2 = (byte)(b1 << 1);
		System.out.println("b2 = " + b2);
		System.out.println(b2 << 2);
	}
}