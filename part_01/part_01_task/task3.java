/*ʵ��˫ɫ��齱��Ϸ�н���������ɣ��н������� 6 ���������� 1 �����������ɡ� 
���к������Ҫ��������� 6 �� 1~33 ֮�䲻�ظ���������롣 
�����������Ҫ��������� 1 �� 1~16 ֮���������롣*/
import java.util.Random;
import java.util.Arrays;
public class task3{
	public static void main(String[] args){
		Random r = new Random(1);
		int number = 0;
		int[] arr = new int[7];
		//��ȡ6��1~33 ֮�䲻�ظ��������ɫ����
		for(int i = 0; i < 6; i++){
			int red = r.nextInt(33);
			arr[i] = red;
			//System.out.println(red);	
		}
		//��ȡ1 �� 1~16 ֮��������ɫ����
		int blue = r.nextInt(16);
		arr[6] = blue;
		//��ӡ��������
		//System.out.println(Arrays.toString(arr));
		StringBuffer str = new StringBuffer();
		//ѭ�����飬������������Ԫ�ؽ���ƴ��
		for(int i=0;i<arr.length;i++){
			str.append(arr[i]);
		}
		System.out.println("˫ɫ��齱��Ϸ�н�����Ϊ��" + str);
	}
}