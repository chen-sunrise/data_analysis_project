 //print�Ǹ�ʽ�����롣println�����Ĭ�ϻ������
 public class forforTest{
	 public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int f =1;f<=5-i;f++){
				System.out.print(" ");
			}
			
			for(int j=1;j <= 2*i - 1;j++){
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		System.out.println("--------------------------------------------");
		for(int i = 1; i <= 5; i++) {
			// �ڲ�ѭ����Ҫ���ڿ��ƴ�ӡ������
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------");
		for(int i = 1; i <= 5; i++) {
			// �ڲ�ѭ����Ҫ���ڿ��ƴ�ӡ������
			for(int j = 1; j <= 6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		outer:for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j + "*" + i + "=" + i*j + " ");
				if(j == 6){
					//break;
					//break������outer����ѭ��
					break outer;
				}
			}
			System.out.println();
		}
	 }
 }