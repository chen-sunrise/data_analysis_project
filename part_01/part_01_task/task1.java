//��һ�⣺��ʾ�û�������������Ϣ���ж���һ������һ���еĵڼ��첢��ӡ��
import java.util.Scanner;
public class task1{
	public static void main(String[] args){
		boolean flag = true;
		int DateNum = 0;
		int date,year,month,day;
		while(flag){
			System.out.println("��������������Ϣ(��ʽΪ��20200706����1970�꿪ʼ����ǰ4λΪ��ݣ���4λΪ����)��");
			Scanner sc = new Scanner(System.in);
			date = sc.nextInt();
			year = date/10000;
			month = (date % 10000)/100;
			day = date % 100;
			if(month > 12 || month < 0) System.out.println("������·�����");
			else if(year < 1970 || year > 9999) System.out.println("������������");
			else if(day < 0 || day > 31) System.out.println("�������������");
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
				//�ж�����Ƿ�Ϊ����
				case 2:
				if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
				DateNum += 29;
				}else{
					DateNum += 28;
				};
				case 1:DateNum += 31;
				}
				//����Ϊfalse����whileѭ��
				flag = false;
				DateNum += day;
				}
			}
	System.out.println("��һ������һ���еĵ�" + DateNum + "�죻");
	}
}