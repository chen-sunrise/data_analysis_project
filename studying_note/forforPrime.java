public class forforPrime{
	public static void main(String[] args){
		for(int i=2;i<=100;i++){
			boolean flag = true;
			//ֻҪ�ж�2��������ƽ�������ɣ���Ϊ���ų����������̱�Ȼ��С
			//for(int j =2;j<i;j++){
			for(int j =2;j<=Math.sqrt(i);j++){
				if(i % j == 0){
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println("i ="+i);
			}
		}
	}
}