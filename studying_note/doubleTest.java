/*public class doubleTest{
	public static void main(String[] args){
		float f1 = 3.141592f;
		System.out.println(f1);
		long l1 = 13;
		System.out.println(l1);
		}
}*/

/* 
ascii�룺0-48 A-65 a-97 �ո�-32 \n-10

*/


// �߼�������Ķ�·���ԣ�&&ֻҪǰ�������Ϊ�٣�����������ͻ�����������ִ��
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
		//System.out.println("������һ����������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println((num >= 100 && num <= 999) ? "����һ����λ����" : "�ⲻ��һ����λ����");
		
		//byte + byte = int �������Ż����ԣ���������byte�����������ݶ�ʧ
		byte b1 = 10;
		//b1 = b1 + 2; //����: �����ݵ�����: ��intת����byte���ܻ�����ʧ
		b1 =(byte)(b1 + 2);
		System.out.println("b1 = " + b1);
	}
}*/

/*
<< ��������������ڽ����ݵĶ����������ƶ����ұ�ʹ��0����
>> ��������������ڽ����ݵĶ����������ƶ����ұ�ʹ�÷���λ����
>>> ��ʾ�߼���������������ڽ����ݵĶ�����λ�����ƶ������ʹ��0����
*/
//����������ȼ���()�����ȼ����ߣ�=�����ȼ����ͣ����޷�ȷ�����ȼ���ʹ��()��ȷ�����ȼ�
public class doubleTest{
	public static void main(String[] args){
		byte b1 = 13;
		System.out.println("b1 = " + b1);
		// ���������������
		//byte b2 = b1 << 1;
		byte b2 = (byte)(b1 << 1);
		System.out.println("b2 = " + b2);
		System.out.println(b2 << 2);
	}
}