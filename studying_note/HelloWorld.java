//导入扫描器
import java.util.Scanner;

public class HelloWorld{
	
	public static void main (String[] args){
		int age;
		//System.out.println("hello world");
		System.out.println("请输入年龄：");
		//新建一个扫描器
		Scanner sc = new Scanner(System.in);
		//读取扫描器的int数据
		age = sc.nextInt();
		System.out.println(age);
	}
	
}