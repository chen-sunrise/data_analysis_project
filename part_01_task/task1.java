//第一题：提示用户输入年月日信息，判断这一天是这一年中的第几天并打印。
import java.util.Scanner;
public class task1{
	public static void main(String[] args){
		boolean flag = true;
		int DateNum = 0;
		int date,year,month,day;
		while(flag){
			System.out.println("请输入年月日信息(格式为：20200706，从1970年开始算起，前4位为年份，后4位为月日)：");
			Scanner sc = new Scanner(System.in);
			date = sc.nextInt();
			year = date/10000;
			month = (date % 10000)/100;
			day = date % 100;
			if(month > 12 || month < 0) System.out.println("输入的月份有误");
			else if(year < 1970 || year > 9999) System.out.println("输入的年份有误");
			else if(day < 0 || day > 31) System.out.println("输入的日期有误");
			else {
				switch(month-1){
				case 11:DateNum += 30;
				case 10:DateNum += 31;
				case 9:DateNum += 30;
				case 8:DateNum += 31;
				case 7:DateNum += 31;
				case 6:DateNum += 30;
				case 5:DateNum += 31;
				case 4:DateNum += 30;
				case 3:DateNum += 31;
				//判断年份是否为闰年
				case 2:
				if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
				DateNum += 29;
				}else{
					DateNum += 28;
				};
				case 1:DateNum += 31;
				}
				//设置为false跳出while循环
				flag = false;
				DateNum += day;
				}
			}
	System.out.println("这一天是这一年中的第" + DateNum + "天；");
	}
}